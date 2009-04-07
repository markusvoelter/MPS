/*
 * Copyright 2003-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.typesystem.inference.util;

import jetbrains.mps.typesystem.inference.*;
import jetbrains.mps.lang.typesystem.structure.*;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.project.AuxilaryRuntimeModel;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 27.08.2007
 * Time: 15:27:37
 * To change this template use File | Settings | File Templates.
 */
public class LatticeUtil {
  public static void processMeetsAndJoins(IWrapper type) {
    if (type instanceof NodeWrapper) {
      SNode node = type.getNode();
      if (node == null) {
        return;
      }
      processMeetsAndJoins(node);
    }
  }

  private static void processMeetsAndJoins(SNode node) {
    String conceptFqName = node.getConceptFqName();
      if (JoinType.concept.equals(conceptFqName)) {
        for (SNode child : node.getChildren(JoinType.ARGUMENT)) {
          processMeetsAndJoins(child);
          if (JoinType.concept.equals(child.getConceptFqName())) {
            for (SNode grandChild : child.getChildren(JoinType.ARGUMENT)) {
              child.removeChild(grandChild);
              node.insertChild(child, JoinType.ARGUMENT, grandChild);
            }
            node.removeChild(child);
          }
        }
      } else if (MeetType.concept.equals(conceptFqName)) {
        for (SNode child : node.getChildren(MeetType.ARGUMENT)) {
          processMeetsAndJoins(child);
          if (MeetType.concept.equals(child.getConceptFqName())) {
            for (SNode grandChild : child.getChildren(MeetType.ARGUMENT)) {
              child.removeChild(grandChild);
              node.insertChild(child, MeetType.ARGUMENT, grandChild);
            }
            node.removeChild(child);
          }
        }
      }
  }

  public static IWrapper join(IWrapper wrapper1, IWrapper wrapper2) {
    JoinType joinType = JoinType.newInstance(TypeChecker.getInstance().getRuntimeTypesModel());
    if (BaseAdapter.isInstance(wrapper1.getNode(), JoinType.class)) {
      JoinType joinWrapper1 = (JoinType) wrapper1.getNode().getAdapter();
      for (BaseConcept bc : joinWrapper1.getArguments()) {
        joinType.addArgument(bc);
      }

      if (BaseAdapter.isInstance(wrapper2.getNode(), JoinType.class)) {
        JoinType joinWrapper2 = (JoinType) wrapper2.getNode().getAdapter();
        for (BaseConcept bc : joinWrapper2.getArguments()) {
          joinType.addArgument(bc);
        }
      } else {
        joinType.addArgument((BaseConcept)(BaseAdapter.fromNode(wrapper2.getNode())));
      }
    } else

    if (BaseAdapter.isInstance(wrapper2.getNode(), JoinType.class)) {
      JoinType joinWrapper2 = (JoinType) wrapper2.getNode().getAdapter();
      joinType.addArgument((BaseConcept)(BaseAdapter.fromNode(wrapper1.getNode())));
      for (BaseConcept bc : joinWrapper2.getArguments()) {
        joinType.addArgument(bc);
      }

    } else {
      joinType.addArgument((BaseConcept)(BaseAdapter.fromNode(wrapper1.getNode())));
      joinType.addArgument((BaseConcept)(BaseAdapter.fromNode(wrapper2.getNode())));
    }
    return NodeWrapper.createWrapperFromNode(joinType.getNode(), null);
  }

  public static IWrapper join(Set<IWrapper> wrappers) {
    if (wrappers.isEmpty()) return null;
    if (wrappers.size() == 1) {
      return wrappers.iterator().next();
    }
    Iterator<IWrapper> iterator = wrappers.iterator();
    IWrapper wrapper1 = iterator.next();
    IWrapper wrapper2 = iterator.next();
    Set<IWrapper> result = new HashSet<IWrapper>(wrappers);
    result.remove(wrapper1);
    result.remove(wrapper2);
    result.add(join(wrapper1, wrapper2));
    return join(result);
  }

  public static IWrapper meet(IWrapper wrapper1, IWrapper wrapper2) {
    MeetType meetType = MeetType.newInstance(TypeChecker.getInstance().getRuntimeTypesModel());
    if (BaseAdapter.isInstance(wrapper1.getNode(), MeetType.class)) {
      MeetType meetWrapper1 = (MeetType) wrapper1.getNode().getAdapter();
      for (BaseConcept bc : meetWrapper1.getArguments()) {
        meetType.addArgument(bc);
      }
      if (BaseAdapter.isInstance(wrapper2.getNode(), MeetType.class)) {
        MeetType meetWrapper2 = (MeetType) wrapper2.getNode().getAdapter();
        for (BaseConcept bc : meetWrapper2.getArguments()) {
          meetType.addArgument(bc);
        }
      } else {
        meetType.addArgument((BaseConcept)(BaseAdapter.fromNode(wrapper2.getNode())));
      }
    } else
    if (BaseAdapter.isInstance(wrapper2.getNode(), MeetType.class)) {
      MeetType meetWrapper2 = (MeetType) wrapper2.getNode().getAdapter();
      meetType.addArgument((BaseConcept)(BaseAdapter.fromNode(wrapper1.getNode())));
      for (BaseConcept bc : meetWrapper2.getArguments()) {
        meetType.addArgument(bc);
      }
    } else {
      meetType.addArgument((BaseConcept)(BaseAdapter.fromNode(wrapper1.getNode())));
      meetType.addArgument((BaseConcept)(BaseAdapter.fromNode(wrapper2.getNode())));
    }
    return NodeWrapper.createWrapperFromNode(meetType.getNode(), null);
  }

  public static IWrapper meet(Set<IWrapper> wrappers) {
    if (wrappers.isEmpty()) return null;
    if (wrappers.size() == 1) {
      return wrappers.iterator().next();
    }
    Iterator<IWrapper> iterator = wrappers.iterator();
    IWrapper wrapper1 = iterator.next();
    IWrapper wrapper2 = iterator.next();
    Set<IWrapper> result = new HashSet<IWrapper>(wrappers);
    result.remove(wrapper1);
    result.remove(wrapper2);
    result.add(meet(wrapper1, wrapper2));
    return meet(result);
  }

  public static SNode createMeet(String conceptFQName, SNode... arguments) {
    SModel auxModel = AuxilaryRuntimeModel.getDescriptor().getSModel();
    MeetType meetType = MeetType.newInstance(auxModel);
    MeetContainer meetContainer = MeetContainer.newInstance(auxModel);
    meetContainer.setMeetType(meetType);
    for (SNode argument : arguments) {
      meetType.addArgument((BaseConcept) argument.getAdapter());
    }
    SNode result = SConceptOperations.createNewNode(conceptFQName, null);
    MeetAnnotation_AnnotationLink.setMeetAnnotation((BaseConcept) result.getAdapter(), meetContainer);
    return result;
  }

   public static SNode createJoin(String conceptFQName, SNode... arguments) {
    SModel auxModel = AuxilaryRuntimeModel.getDescriptor().getSModel();
    JoinType joinType = JoinType.newInstance(auxModel);
    JoinContainer joinContainer = JoinContainer.newInstance(auxModel);
    joinContainer.setJoinType(joinType);
    for (SNode argument : arguments) {
      joinType.addArgument((BaseConcept) argument.getAdapter());
    }
    SNode result = SConceptOperations.createNewNode(conceptFQName, null);
    JoinAnnotation_AnnotationLink.setJoinAnnotation((BaseConcept) result.getAdapter(), joinContainer);
    return result;
  }

  public static boolean isMeet(SNode node) {
    return BaseAdapter.isInstance(node, MeetType.class) ||
      MeetAnnotation_AnnotationLink.getMeetAnnotation((BaseConcept) node.getAdapter()) != null;
  }

   public static boolean isJoin(SNode node) {
    return BaseAdapter.isInstance(node, JoinType.class) ||
      JoinAnnotation_AnnotationLink.getJoinAnnotation((BaseConcept) node.getAdapter()) != null;
  }

  public static List<SNode> getMeetArguments(SNode meet) {
    if (BaseAdapter.isInstance(meet, MeetType.class)) {
      return meet.getChildren(MeetType.ARGUMENT);
    } else {
      MeetContainer meetContainer = MeetAnnotation_AnnotationLink.getMeetAnnotation((BaseConcept) meet.getAdapter());
      MeetType meetType = meetContainer.getMeetType();
      return meetType.getNode().getChildren(MeetType.ARGUMENT);
    }
  }

  public static List<SNode> getJoinArguments(SNode join) {
    if (BaseAdapter.isInstance(join, JoinType.class)) {
      return join.getChildren(JoinType.ARGUMENT);
    } else {
      JoinContainer joinContainer = JoinAnnotation_AnnotationLink.getJoinAnnotation((BaseConcept) join.getAdapter());
      JoinType joinType = joinContainer.getJoinType();
      return joinType.getNode().getChildren(JoinType.ARGUMENT);
    }
  }
}
