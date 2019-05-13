package com.vasan.algorithmlearning.binarytree.demo;

import com.vasan.algorithmlearning.binarytree.model.Node;
import com.vasan.algorithmlearning.binarytree.utils.NodeUtil;

/**
 * https://www.geeksforgeeks.org/print-leaf-nodes-left-right-binary-tree/
 */
public class PrintLeftToRight {

  private Node data = NodeUtil.createData();

  public static void main(String[] args) {
    PrintLeftToRight g = new PrintLeftToRight();
    g.printNodeLeftToRight(g.data);
  }

  private void printNodeLeftToRight(Node data) {
    if (data.getLeft() == null && data.getRight() == null) {
      System.out.println(data.getData());
    }

    if (data.getLeft() != null) {
      printNodeLeftToRight(data.getLeft());
    }

    if (data.getRight() != null) {
      printNodeLeftToRight(data.getRight());
    }
  }
}