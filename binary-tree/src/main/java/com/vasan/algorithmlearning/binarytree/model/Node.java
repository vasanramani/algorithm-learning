package com.vasan.algorithmlearning.binarytree.model;

import com.vasan.algorithmlearning.binarytree.demo.PrintBinaryTreeLeftToRight;

public class Node {
  int data;
  Node left, right;

  public Node(int data, Node left, Node right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }

  public int getData() {
    return data;
  }

  public Node getLeft() {
    return left;
  }

  public Node getRight() {
    return right;
  }

  public String toString() {
    return "{" + data + ", " + left + ", " + right + "}";
  }
}