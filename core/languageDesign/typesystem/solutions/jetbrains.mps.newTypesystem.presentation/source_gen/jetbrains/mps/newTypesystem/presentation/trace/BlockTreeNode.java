package jetbrains.mps.newTypesystem.presentation.trace;

/*Generated by MPS */

import java.util.Map;
import jetbrains.mps.newTypesystem.state.RelationKind;
import java.awt.Color;
import jetbrains.mps.newTypesystem.state.Block;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.newTypesystem.state.State;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.newTypesystem.state.BlockKind;
import jetbrains.mps.newTypesystem.state.InequalityBlock;
import java.util.HashMap;

public class BlockTreeNode extends TypeSystemStateTreeNode {
  private static final Map<RelationKind, Color> COLOR_MAP = initColors();

  private Block myBlock;

  public BlockTreeNode(Block block, IOperationContext operationContext, State state, EditorComponent editorComponent) {
    super(block.getExpandedPresentation(state), operationContext);
    myBlock = block;
    myRuleId = block.getNodeId();
    myRuleModel = block.getNodeModel();
    setTooltipText(PresentationUtil.getVariablesTooltipPresentation(editorComponent, block.getVariables(), state));
  }

  @Override
  protected void doUpdatePresentation() {
    Color color = Color.BLACK;
    if (myBlock.getBlockKind().equals(BlockKind.INEQUALITY)) {
      color = BlockTreeNode.COLOR_MAP.get(((InequalityBlock) myBlock).getRelationKind());
    }
    setColor(color);
  }

  private static Map<RelationKind, Color> initColors() {
    Map<RelationKind, Color> result = new HashMap<RelationKind, Color>();
    result.put(RelationKind.WEAK, new Color(119));
    result.put(RelationKind.STRONG, new Color(119));
    return result;
  }
}
