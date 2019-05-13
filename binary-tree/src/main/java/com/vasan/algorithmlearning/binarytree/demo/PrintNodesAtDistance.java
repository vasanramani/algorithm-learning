package com.vasan.algorithmlearning.binarytree.demo;

import com.vasan.algorithmlearning.binarytree.model.Node;
import com.vasan.algorithmlearning.binarytree.utils.NodeUtil;

/**
 * https://www.geeksforgeeks.org/print-nodes-k-distance-root-iterative/
 */
public class PrintNodesAtDistance {

  private Node data = NodeUtil.createData();

  public static void main(String[] args) {
    PrintNodesAtDistance g = new PrintNodesAtDistance();
    g.printAtDistance(g.data);
  }

  private void printAtDistance(Node data) {
  }
}
