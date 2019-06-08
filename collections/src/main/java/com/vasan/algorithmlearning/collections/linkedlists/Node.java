package com.vasan.algorithmlearning.collections.linkedlists;

import javax.sound.midi.Soundbank;

public class Node {

    private String data;
    private Node nextNode;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node() {

    }

    public Node(String data) {
        this.setData(data);
    }

    public Node(String data, Node nextNode) {
        this.setData(data);
        this.setNextNode(nextNode);
    }

    @Override
    public String toString() {
        return "[" + getData() + ", " + getNextNode() + "]";
    }

    public void add(Node node) {
        if (getNextNode() == null) {
            System.out.println("Adding to node with data: " + getData());
            setNextNode(node);
        } else {
            getNextNode().add(node);
        }
    }

    public void remove(Node node) {
        if (getNextNode() != null) {
            if (getNextNode().getData().equals(node.getData())) {
                setNextNode(null);
            } else {
                getNextNode().remove(node);
            }
        } else {
            System.out.println("Node with data: " + node.getData() + " not found");
        }
    }
}
