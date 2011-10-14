package jetbrains.mps.typesystemEngine.checker;

/*Generated by MPS */

import jetbrains.mps.components.CoreComponent;
import jetbrains.mps.checkers.CheckersComponent;

public class TypesystemCheckerComponent implements CoreComponent {
  private CheckersComponent myCheckersComponent;
  private TypesystemChecker myChecker;

  public TypesystemCheckerComponent(CheckersComponent component) {
    myCheckersComponent = component;
    myChecker = new TypesystemChecker();
  }

  public void init() {
    myCheckersComponent.addChecker(myChecker);
  }

  public void dispose() {
    myCheckersComponent.removeChecker(myChecker);
  }
}
