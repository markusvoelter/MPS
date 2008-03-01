package webr.xml.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class ContentList extends Content {
  public static final String concept = "webr.xml.structure.ContentList";
  public static String CONTENT = "content";
  public static String IS_HORIZONTAL = "isHorizontal";

  public  ContentList(SNode node) {
    super(node);
  }

  public static ContentList newInstance(SModel sm, boolean init) {
    return (ContentList)SModelUtil_new.instantiateConceptDeclaration("webr.xml.structure.ContentList", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ContentList newInstance(SModel sm) {
    return ContentList.newInstance(sm, false);
  }


  public int getContentsCount() {
    return this.getChildCount(ContentList.CONTENT);
  }

  public Iterator<Content> contents() {
    return this.children(ContentList.CONTENT);
  }

  public List<Content> getContents() {
    return this.getChildren(ContentList.CONTENT);
  }

  public void addContent(Content node) {
    this.addChild(ContentList.CONTENT, node);
  }

  public void insertContent(Content prev, Content node) {
    this.insertChild(prev, ContentList.CONTENT, node);
  }

  public boolean getIsHorizontal() {
    return this.getBooleanProperty(ContentList.IS_HORIZONTAL);
  }

  public void setIsHorizontal(boolean value) {
    this.setBooleanProperty(ContentList.IS_HORIZONTAL, value);
  }

}
