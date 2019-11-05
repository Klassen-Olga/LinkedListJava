package de;

public class Louncher {
    public static void main(String[] args) {
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        LinkedList list=new LinkedList();
        int size=list.size();
        list.pushFront(node1);
        size=list.size();
        list.pushFront(node2);
        size=list.size();
        list.pushFront(node3);
        size=list.size();
        list.pushBack(node4);
        size=list.size();
        list.popFront();
        size=list.size();
    }
}
