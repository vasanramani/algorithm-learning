package com.vasan.algorithmlearning.collections.linkedlists;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.addToLinkedList();
        ll.removeFromLinkedList();
    }

    Node node = new Node("0");

    private void addToLinkedList() {
        for (int i = 1; i < 10; i++) {
            System.out.println("--------------------------------------------------------");
            System.out.println("Before: " + node);
            System.out.println("Adding: " + i);
            node.add(new Node(String.valueOf(i)));
            System.out.println("After : " + node);
        }
    }

    private void removeFromLinkedList() {
        System.out.println("--------------------------------------------------------");
        node.remove(new Node("30"));
        System.out.println("--------------------------------------------------------");
        node.remove(new Node("3"));
        System.out.println(node);
    }
}
