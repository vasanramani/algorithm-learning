package com.vasan.algorithmlearning.binarytree.demo;

import com.vasan.algorithmlearning.binarytree.model.Node;

/**
 * https://www.geeksforgeeks.org/print-leaf-nodes-left-right-binary-tree/
 */
public class PrintBinaryTreeLeftToRight {
  Node data;

  public static void main(String[] args) {
    PrintBinaryTreeLeftToRight g = new PrintBinaryTreeLeftToRight();
    g.createData();
    g.printall();
    g.printNodeLeftToRight(g.data);
  }

  private void createData() {
    this.data = new Node(1, new Node(2, new Node(4, null, null), null),
        new Node(3, new Node(5, new Node(6, null, null), new Node(7, null, null)),
            new Node(8, new Node(9, null, null), new Node(10, null, null))));
  }

  private void printall() {
    System.out.println(data);
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
