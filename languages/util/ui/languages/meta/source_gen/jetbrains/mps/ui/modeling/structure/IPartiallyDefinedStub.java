package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.lang.core.structure.BaseConcept;

public interface IPartiallyDefinedStub extends INodeAdapter {
  public static final String concept = "jetbrains.mps.ui.modeling.structure.IPartiallyDefinedStub";
  public static final String HAS_TEMPLATE = "hasTemplate";
  public static final String SELECTOR = "selector";
  public static final String ROLE = "role";
  public static final String TEMPLATE = "template";

  public HasTemplate getHasTemplate();
  public void setHasTemplate(HasTemplate node);
  public LinkDeclaration getSelector();
  public void setSelector(LinkDeclaration node);
  public LinkDeclaration getRole();
  public void setRole(LinkDeclaration node);
  public BaseConcept getTemplate();
  public void setTemplate(BaseConcept node);
}
