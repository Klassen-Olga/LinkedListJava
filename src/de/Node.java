package de;

public class Node <T>{
    private T data;
    Node next;
    Node previous;
    Node(){
        next=null;
        previous=null;
    }
    Node(T data){
        this.data=data;
        next=null;
        previous=null;
    }
}
