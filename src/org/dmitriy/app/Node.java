package org.dmitriy.app;

import java.util.List;

public class Node {
    private Node parent;
    private List<Node> child;
    private String address;

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public List<Node> getChild() {
        return child;
    }

    public void setChild(List<Node> child) {
        this.child = child;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
