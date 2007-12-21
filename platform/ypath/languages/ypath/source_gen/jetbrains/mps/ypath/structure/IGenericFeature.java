package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import java.util.Iterator;
import java.util.List;

public interface IGenericFeature extends IFeature {
  public static final String concept = "jetbrains.mps.ypath.structure.IGenericFeature";
  public static String GETTER = "getter";
  public static String FUN_HOLDERS = "funHolders";

  public GFGetterFun getGetter();

  public void setGetter(GFGetterFun node);

  public int getFunHoldersesCount();

  public Iterator<GenericFeatureFunHolder> funHolderses();

  public List<GenericFeatureFunHolder> getFunHolderses();

  public void addFunHolders(GenericFeatureFunHolder node);

  public void insertFunHolders(GenericFeatureFunHolder prev, GenericFeatureFunHolder node);

}
