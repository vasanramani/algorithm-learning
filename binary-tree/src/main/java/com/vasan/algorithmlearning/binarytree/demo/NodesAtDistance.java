package com.vasan.algorithmlearning.binarytree.demo;

import com.vasan.algorithmlearning.binarytree.model.Node;
import com.vasan.algorithmlearning.binarytree.utils.NodeUtil;

/**
 * https://www.geeksforgeeks.org/print-nodes-k-distance-root-iterative/
 */
public class NodesAtDistance {

  private final int levelToPrint;
  private Node data = NodeUtil.createData();

  public NodesAtDistance(int levelToPrint) {
    this.levelToPrint = levelToPrint;
  }

  public static void main(String[] args) {
    NodesAtDistance g = new NodesAtDistance(4);
    g.printAtDistance();
  }

  private void printAtDistance() {
    printAtDistance(0, data);
  }

  private void printAtDistance(int level, Node data) {
    level++;
    if (level == levelToPrint) {
      System.out.println(data.getData());
    }

    if (data.getLeft() != null) {
      printAtDistance(level, data.getLeft());
    }

    if (data.getRight() != null) {
      printAtDistance(level, data.getRight());
    }

  }
}
