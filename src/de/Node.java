package de;

public class Node {
    private int number;
    Node next;
    Node previous;
    Node(){
        next=null;
        previous=null;
    }
    Node(int number){
        this.number=number;
        next=null;
        previous=null;
    }
}
