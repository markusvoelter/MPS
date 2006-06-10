/*
 * Created by IntelliJ IDEA.
 * User: alshan
 * Date: Apr 6, 2004
 * Time: 6:15:23 AM
 */
package jetbrains.mps.nodeEditor;


import jetbrains.mps.logging.Logger;
import jetbrains.mps.util.Pair;

import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import java.util.*;

public class EditorCellKeyMap {
  private static final Logger LOG = Logger.getLogger(EditorCellKeyMap.class);

  public static final String KEY_MODIFIERS_NONE = "none";
  public static final String KEY_MODIFIERS_ANY = "any";

  public static final String KEY_MODIFIERS_CTRL = "ctrl";
  public static final String KEY_MODIFIERS_ALT = "alt";
  public static final String KEY_MODIFIERS_SHIFT = "shift";
  public static final String KEY_MODIFIERS_CTRL_ALT = "ctrl+alt";
  public static final String KEY_MODIFIERS_CTRL_SHIFT = "ctrl+shift";
  public static final String KEY_MODIFIERS_CTRL_ALT_SHIFT = "ctrl+alt+shift";
  public static final String KEY_MODIFIERS_ALT_SHIFT = "alt+shift";

  public static final String KEY_CODE_DIGIT = "digit";
  public static final String KEY_CODE_LETTER = "letter";
  public static final String KEY_CODE_LETTER_OR_DIGIT = "letter or digit";
  public static final String KEY_CODE_SPACE = "space char";
  public static final String KEY_CODE_CHAR = "non-space char";

  private static HashMap<Integer, String> ourJavaKeycodesMap = new HashMap<Integer, String>();
  private static List<String> ourVirtualKeycodes;
  private static List<String> ourKeycodeCategories;
  private static List<String> ourModifiers;

  static {
    Field[] declaredFields = KeyEvent.class.getDeclaredFields();
    for (int i = 0; i < declaredFields.length; i++) {
      Field field = declaredFields[i];
      String name = field.getName();
      if (name.startsWith("VK_")) {
        if (name.equals("VK_CONTROL") ||
                name.equals("VK_ALT") ||
                name.equals("VK_SHIFT")) {
          continue;
        }
        try {
          int value = field.getInt(null);
          ourJavaKeycodesMap.put(new Integer(value), name);
        } catch (IllegalAccessException e) {
          LOG.error(e);
        }
      }
    }
  } // static init

  private HashMap<ActionKey, EditorCellKeyMapAction> myActionMap;
  private List<Pair<ActionKey, EditorCellKeyMapAction>> myDuplicatedActionList;
  private List<EditorCellKeyMap> myChildKeyMaps;
  private boolean myApplicableToEveryModel = false;
  private String myStereotype = null;

  public EditorCellKeyMap() {
    myActionMap = new HashMap<ActionKey, EditorCellKeyMapAction>();
  }

  public void addKeyMap(EditorCellKeyMap keyMap) {
    if (myChildKeyMaps == null) {
      myChildKeyMaps = new LinkedList<EditorCellKeyMap>();
    }
    myChildKeyMaps.add(keyMap);
  }

  public void putAction(String modifiers, String keyCode, EditorCellKeyMapAction action) {
    ActionKey key = new ActionKey(modifiers, keyCode);
    if (!myActionMap.containsKey(key)) {
      myActionMap.put(key, action);
    } else {
      addToDuplicatedActions(key, action);
    }
  }

  private void addToDuplicatedActions(ActionKey key, EditorCellKeyMapAction action) {
    if (myDuplicatedActionList == null) {
      myDuplicatedActionList = new LinkedList<Pair<ActionKey, EditorCellKeyMapAction>>();
    }
    myDuplicatedActionList.add(new Pair<ActionKey, EditorCellKeyMapAction>(key, action));
  }

  private static List<EditorCellKeyMapAction> lookupDuplicatedActions(ActionKey key, List<Pair<ActionKey, EditorCellKeyMapAction>> actions) {
    if (actions == null) return Collections.emptyList();
    List<EditorCellKeyMapAction> result = null;
    for (Pair<ActionKey, EditorCellKeyMapAction> pair : actions) {
      if (pair.o1.equals(key)) {
        if (result == null) result = new LinkedList<EditorCellKeyMapAction>();
        result.add(pair.o2);
      }
    }
    if (result == null) return Collections.emptyList();
    return result;
  }

  public boolean hasActions(KeyEvent event) {
    if (findActions(this, event).size() > 0) {
      return true;
    }
    if (myChildKeyMaps != null) {
      Iterator<EditorCellKeyMap> iterator = myChildKeyMaps.iterator();
      while (iterator.hasNext()) {
        EditorCellKeyMap childKeyMap = iterator.next();
        if (findActions(childKeyMap, event).size() > 0) {
          return true;
        }
      }
    }
    return false;
  }

  public List<EditorCellKeyMapAction> getActions(KeyEvent event) {
    List<EditorCellKeyMapAction> result = null;
    List<EditorCellKeyMapAction> actions = findActions(this, event);
    if (actions.size() > 0) {
      if (result == null) result = new LinkedList<EditorCellKeyMapAction>();
      result.addAll(actions);
    }
    if (myChildKeyMaps != null) {
      for (EditorCellKeyMap childKeyMap : myChildKeyMaps) {
        actions = findActions(childKeyMap, event);
        if (actions.size() > 0) {
          if (result == null) result = new LinkedList<EditorCellKeyMapAction>();
          result.addAll(actions);
        }
      }
    }
    if (result == null) return Collections.emptyList();
    return result;
  }

  public List<ActionKey> getActionKeys() {
    return new ArrayList<ActionKey>(myActionMap.keySet());
  }

  private static List<EditorCellKeyMapAction> findActions(EditorCellKeyMap keyMap, KeyEvent event) {
    List<EditorCellKeyMapAction> result = null;
    List<ActionKey> actionKeies = keyEvent2ActionKey(event);
    for (ActionKey actionKey : actionKeies) {
      EditorCellKeyMapAction action = keyMap.myActionMap.get(actionKey);
      if (action != null) {
        if (result == null) result = new LinkedList<EditorCellKeyMapAction>();
        LOG.debug("keymap action " + (result.isEmpty() ? "" : "[" + result.size() + "]") + " found for key: " + actionKey);
        if (!result.contains(action)) {
          result.add(action);
        }
      }

      List<EditorCellKeyMapAction> extraActions = lookupDuplicatedActions(actionKey, keyMap.myDuplicatedActionList);
      if (extraActions.size() > 0) {
        LOG.debug("keymap action found [" + extraActions.size() + "] extra actions for key: " + actionKey);
        if (result == null) result = new LinkedList<EditorCellKeyMapAction>();
        // only add actions which are different
        for (EditorCellKeyMapAction extraAction : extraActions) {
          if (!result.contains(extraAction)) {
            result.add(extraAction);
          }
        }
      }
    }

    if (result == null) return Collections.emptyList();
    return result;
  }

  private static List<ActionKey> keyEvent2ActionKey(KeyEvent event) {
    List<ActionKey> keys = new LinkedList<ActionKey>();
    List<String> modifiers = modifiersForEvent(event);
    List<String> keyCodes = keyCodesForEvent(event);
    if (modifiers.size() > 0 && keyCodes.size() > 0) {
      for (int iMod = 0; iMod < modifiers.size(); iMod++) {
        String modifier = modifiers.get(iMod);
        for (int iKey = 0; iKey < keyCodes.size(); iKey++) {
          String keyKode = keyCodes.get(iKey);
          ActionKey actionKey = new ActionKey(modifier, keyKode);
//          System.out.println("key map add action key: " + actionKey);
          keys.add(actionKey);
        }
      }
    }
    return keys;
  }

  private static List<String> modifiersForEvent(KeyEvent event) {
    List<String> modifiers = new LinkedList<String>();
    if (event.getModifiers() == 0) {
      modifiers.add(KEY_MODIFIERS_NONE);
    } else if (event.isControlDown() && !event.isAltDown() && !event.isShiftDown()) {
      modifiers.add(KEY_MODIFIERS_CTRL);
    } else if (!event.isControlDown() && event.isAltDown() && !event.isShiftDown()) {
      modifiers.add(KEY_MODIFIERS_ALT);
    } else if (!event.isControlDown() && !event.isAltDown() && event.isShiftDown()) {
      modifiers.add(KEY_MODIFIERS_SHIFT);
    } else if (event.isControlDown() && event.isAltDown() && !event.isShiftDown()) {
      modifiers.add(KEY_MODIFIERS_CTRL_ALT);
    } else if (event.isControlDown() && !event.isAltDown() && event.isShiftDown()) {
      modifiers.add(KEY_MODIFIERS_CTRL_SHIFT);
    } else if (event.isControlDown() && event.isAltDown() && event.isShiftDown()) {
      modifiers.add(KEY_MODIFIERS_CTRL_ALT_SHIFT);
    } else if (!event.isControlDown() && event.isAltDown() && event.isShiftDown()) {
      modifiers.add(KEY_MODIFIERS_ALT_SHIFT);
    }

    modifiers.add(KEY_MODIFIERS_ANY);
    return modifiers;
  }

  private static List<String> keyCodesForEvent(KeyEvent event) {
    List<String> keyCodes = new LinkedList<String>();

    int keyCode = event.getKeyCode();
    if (keyCode == KeyEvent.VK_UNDEFINED) {
      return keyCodes;
    }

    keyCodes.add("");

    if (keyCode != KeyEvent.VK_CONTROL &&
            keyCode != KeyEvent.VK_ALT &&
            keyCode != KeyEvent.VK_SHIFT) {
      String keyCodeName = ourJavaKeycodesMap.get(new Integer(keyCode));
      assert keyCodeName != null;
      keyCodes.add(keyCodeName);
    }

    // todo: the "keychar" testing in the "key pressed" event is not very reliable
    // todo: the "key typed" event should be handled instead
    if (event.isControlDown() || event.isAltDown()) {
      // ignore keychar
      return keyCodes;
    }

    char keyChar = event.getKeyChar();
    if (keyChar == KeyEvent.CHAR_UNDEFINED) {
      return keyCodes;
    }

    keyCodes.add("" + keyChar);

    if (!Character.isSpaceChar(keyChar) && !Character.isWhitespace(keyChar) &&
            keyChar != KeyEvent.VK_DELETE &&
            keyChar != KeyEvent.VK_ESCAPE &&
            keyChar != KeyEvent.VK_BACK_SPACE) {
      keyCodes.add(KEY_CODE_CHAR);
    }

    if (Character.isDigit(keyChar)) {
      keyCodes.add(KEY_CODE_DIGIT);
      keyCodes.add(KEY_CODE_LETTER_OR_DIGIT);
    } else if (Character.isLetter(keyChar)) {
      keyCodes.add(KEY_CODE_LETTER);
      keyCodes.add(KEY_CODE_LETTER_OR_DIGIT);
    } else if (Character.isLetterOrDigit(keyChar)) {
      keyCodes.add(KEY_CODE_LETTER_OR_DIGIT);
    } else if (Character.isSpaceChar(keyChar) || Character.isWhitespace(keyChar)) {
      keyCodes.add(KEY_CODE_SPACE);
    }

    return keyCodes;
  }

  public static List<String> getVirtualKeycodes() {
    if (ourVirtualKeycodes == null) {
      ourVirtualKeycodes = new LinkedList<String>();
      Iterator<Integer> iterator = ourJavaKeycodesMap.keySet().iterator();
      while (iterator.hasNext()) {
        Integer keyCode = iterator.next();
        ourVirtualKeycodes.add(ourJavaKeycodesMap.get(keyCode));
      }
    }
    return ourVirtualKeycodes;
  }

  public static List<String> getModifiers() {
    if (ourModifiers == null) {
      ourModifiers = new LinkedList<String>();
      Field[] fields = EditorCellKeyMap.class.getFields();
      for (int i = 0; i < fields.length; i++) {
        Field field = fields[i];
        String name = field.getName();
        if (name.startsWith("KEY_MODIFIERS_")) {
          try {
            String value = field.get(null).toString();
            ourModifiers.add(value);
          } catch (IllegalAccessException e) {
            LOG.error(e);
          }
        }
      }
    }
    return ourModifiers;
  }

  public static List<String> getKeycodeCategories() {
    if (ourKeycodeCategories == null) {
      ourKeycodeCategories = new LinkedList<String>();
      Field[] fields = EditorCellKeyMap.class.getFields();
      for (int i = 0; i < fields.length; i++) {
        Field field = fields[i];
        String name = field.getName();
        if (name.startsWith("KEY_CODE_")) {
          try {
            String value = field.get(null).toString();
            ourKeycodeCategories.add(value);
          } catch (IllegalAccessException e) {
            LOG.error(e);
          }
        }
      }
    }
    return ourKeycodeCategories;
  }

  public static boolean isValidModifiers(String modifiers) {
    List<String> ourModifiers = getModifiers();
    return ourModifiers.contains(modifiers);
  }

  public static boolean isValidKeycode(String keycode) {
    if (keycode == null || keycode.length() == 0) {
      return true;
    }
    if (keycode.length() == 1) {
      return true;
    }

    List<String> ourVirtualKeycodes = getVirtualKeycodes();
    List<String> ourKeycodeCategories = getKeycodeCategories();
    return ourKeycodeCategories.contains(keycode) || ourVirtualKeycodes.contains(keycode);
  }

  public boolean isApplicableToEveryModel() {
    return myApplicableToEveryModel;
  }

  public String getStereotype() {
    return myStereotype;
  }

  public void setApplicableToEveryModel(boolean isApplicable) {
    myApplicableToEveryModel = isApplicable;
  }

  public void setStereotype(String stereotype) {
    myStereotype = stereotype;
  }

  public static class ActionKey {
    private String myModifiers;
    private String myKeyCode;

    public ActionKey(String modifiers, String keyCode) {
      assert modifiers != null;
      assert keyCode != null;
      myModifiers = modifiers;
      myKeyCode = keyCode;
    }

    public int hashCode() {
      return myModifiers.hashCode() ^ myKeyCode.hashCode();
    }

    public boolean equals(Object o) {
      return o != null && hashCode() == o.hashCode();
    }

    public String toString() {
      return "action key: " + myModifiers + " + " + myKeyCode;
    }
  }
}