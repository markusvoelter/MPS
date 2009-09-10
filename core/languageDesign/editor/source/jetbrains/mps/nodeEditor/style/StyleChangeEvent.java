package jetbrains.mps.nodeEditor.style;

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class StyleChangeEvent {
  private Style myStyle;
  private Set<StyleAttribute> myChangedAttributes;

  public StyleChangeEvent(Style style, Set<StyleAttribute> changedAttributes) {
    myStyle = style;
    myChangedAttributes = new HashSet<StyleAttribute>(changedAttributes);
  }

  public Style getStyle() {
    return myStyle;
  }

  public Set<StyleAttribute> getChangedAttributes() {
    return Collections.unmodifiableSet(myChangedAttributes);
  }
}
