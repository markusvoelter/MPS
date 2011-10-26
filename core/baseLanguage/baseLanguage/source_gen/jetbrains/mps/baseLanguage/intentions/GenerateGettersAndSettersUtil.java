package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.util.Pair;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.Project;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.codeStyle.CodeStyleSettings;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class GenerateGettersAndSettersUtil {
  public GenerateGettersAndSettersUtil() {
  }

  private static String getPreparedName(String fullName, Pair<String, String> settings) {
    String prefix = (settings.o1 == null ?
      "" :
      settings.o1
    );
    String suffix = (settings.o2 == null ?
      "" :
      settings.o2
    );
    int preparedNameStart = ((StringUtils.isNotEmpty(prefix) && fullName.startsWith(prefix)) ?
      prefix.length() :
      0
    );
    int preparedNameEnd = ((StringUtils.isNotEmpty(suffix) && fullName.endsWith(suffix)) ?
      fullName.indexOf(suffix) :
      fullName.length()
    );
    if (preparedNameStart >= preparedNameEnd) {
      return fullName;
    }
    return fullName.substring(preparedNameStart, preparedNameEnd);
  }

  public static String getFieldGetterName(SNode fieldDeclaration, Project project) {
    String get = "get";
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(fieldDeclaration, "type", true), "jetbrains.mps.baseLanguage.structure.BooleanType")) {
      get = "is";
    }
    return get + NameUtil.capitalize(getPreparedFieldName(fieldDeclaration, project));
  }

  public static String getFieldSetterName(SNode fieldDeclaration, Project project) {
    return "set" + NameUtil.capitalize(getPreparedFieldName(fieldDeclaration, project));
  }

  public static String getParameterNameForField(SNode field, Project project) {
    String preparedFieldName = getPreparedFieldName(field, project);
    CodeStyleSettings codeStyleSettings = CodeStyleSettings.getInstance(ProjectHelper.toIdeaProject(project));
    if (codeStyleSettings == null) {
      return NameUtil.decapitalize(preparedFieldName);
    }
    Pair<String, String> settings = codeStyleSettings.getParameterSettings();
    String prefix = (settings.o1 == null ?
      "" :
      settings.o1
    );
    String suffix = (settings.o2 == null ?
      "" :
      settings.o2
    );
    String paramName;
    if (StringUtils.isEmpty(prefix)) {
      paramName = NameUtil.decapitalize(preparedFieldName + suffix);
    } else {
      paramName = prefix + preparedFieldName + suffix;
    }
    if (paramName.equals(SPropertyOperations.getString(field, "name"))) {
      paramName = paramName + "1";
    }
    return paramName;
  }

  public static String getPreparedFieldName(SNode fieldDeclaration, Project project) {
    String rawName = SPropertyOperations.getString(fieldDeclaration, "name");
    if (rawName == null || rawName.length() == 0) {
      return "unnamedField";
    }
    CodeStyleSettings codeStyleSettings = CodeStyleSettings.getInstance(ProjectHelper.toIdeaProject(project));
    if (codeStyleSettings == null) {
      return rawName;
    }
    return getPreparedName(rawName, codeStyleSettings.getFieldSettings());
  }
}
