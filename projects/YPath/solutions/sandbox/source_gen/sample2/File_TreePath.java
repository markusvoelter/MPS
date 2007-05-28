package sample2;

/*Generated by MPS */

import ypath.util.TreePath;
import java.io.File;
import ypath.util.IFilter;
import sample2.File_TreePath.FILE_name_Property;

public class File_TreePath extends TreePath<File> {

  public File parent(File node) {
    return File_TreePath.Parent.parent(node);
  }
  public File[] childrenArray(File n) {
    return File_TreePath.Children.childrenArray(n);
  }
  private static class Parent {

    /* package */Object _enclosingClass;
    /* package */Object _closureContext;

    public  Parent(Object enclosingClass, Object closureContext) {
      this._enclosingClass = enclosingClass;
      this._closureContext = (Object)closureContext;
    }

    public static File parent(File n) {
      return n;
    }
}
  private static class Children {

    /* package */Object _enclosingClass;
    /* package */Object _closureContext;

    public  Children(Object enclosingClass, Object closureContext) {
      this._enclosingClass = enclosingClass;
      this._closureContext = (Object)closureContext;
    }

    public static File[] childrenArray(File n) {
      return n.listFiles();
    }
}
  public static class FILE_NodeKindTrigger implements IFilter<File> {
    public static File_TreePath.FILE_NodeKindTrigger instance;

    /* package */Object _enclosingClass;
    /* package */Object _closureContext;

    private  FILE_NodeKindTrigger() {
    }
    public  FILE_NodeKindTrigger(Object enclosingClass, Object closureContext) {
      this._enclosingClass = enclosingClass;
      this._closureContext = (Object)closureContext;
    }

    public static IFilter<File> getInstance() {
      if(instance == null) {
        instance = new File_TreePath.FILE_NodeKindTrigger();
      }
      return instance;
    }

    public boolean accept(File f) {
      return f.isFile();
    }
}
  public static class DIR_NodeKindTrigger implements IFilter<File> {
    public static File_TreePath.DIR_NodeKindTrigger instance;

    /* package */Object _enclosingClass;
    /* package */Object _closureContext;

    private  DIR_NodeKindTrigger() {
    }
    public  DIR_NodeKindTrigger(Object enclosingClass, Object closureContext) {
      this._enclosingClass = enclosingClass;
      this._closureContext = (Object)closureContext;
    }

    public static IFilter<File> getInstance() {
      if(instance == null) {
        instance = new File_TreePath.DIR_NodeKindTrigger();
      }
      return instance;
    }

    public boolean accept(File f) {
      return f.isDirectory();
    }
}
  public static class FILE_name_Property {

    public static IFilter<File> getMatcher(final String matchValue) {
      IFilter filter;
      if(matchValue != null) {
        filter = new IFilter() {

          public boolean accept(Object n) {
            File node = (File)n;
            String actualValue = File_TreePath.FILE_name_Property.Getter.getValue(node);
            return matchValue.equals(actualValue);
          }
        };
      } else
      {
        filter = new IFilter() {

          public boolean accept(Object n) {
            File node = (File)n;
            String actualValue = File_TreePath.FILE_name_Property.Getter.getValue(node);
            return actualValue == null;
          }
        };
      }
      return (IFilter<File>)filter;
    }
    private static class Getter {

      /* package */Object _enclosingClass;
      /* package */Object _closureContext;

      public  Getter(Object enclosingClass, Object closureContext) {
        this._enclosingClass = enclosingClass;
        this._closureContext = (Object)closureContext;
      }

      public static String getValue(File f) {
        return f.getName();
      }
}

}

}
