package com.vasan.algorithmlearning.binarytree.utils;

import com.vasan.algorithmlearning.binarytree.model.Node;

public final class NodeUtil {
  private NodeUtil() {
  }

  public static Node createData() {
    return new Node(1, new Node(2, new Node(4, null, null), null),
        new Node(3, new Node(5, new Node(6, null, null), new Node(7, null, null)),
            new Node(8, new Node(9, null, null), new Node(10, null, null))));
  }
}
