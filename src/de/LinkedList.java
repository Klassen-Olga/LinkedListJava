package de;

public class LinkedList {
    Node first;
    Node last;
    LinkedList(){
        first=null;
        last=null;
    }
    void pushFront(Node node){

        if(first==last && first==null){
            first=node;
            last=node;

        }

        else {
            first.previous=node;
            node.previous=null;
            node.next=first;
            first=node;
        }
    }
    void pushBack(Node node){
        if(first==last && first==null){
            first=node;
            last=node;

        }
        else{
            node.next=null;
            node.previous=last;
            last.next=node;
            last=node;
        }

    }
    int size(){
        if(first==null){return 0;}
        if (first.next==null){return 1;}

        int size=0;
        Node nodeHelp1=first;

        while(nodeHelp1!=null){
            size++;
            nodeHelp1=nodeHelp1.next;
        }
        return size;
    }
    void popFront(){
        if (first==null){return;}
        else if(first.next==null){//only 1 element in list
            first=null;
            last=null;
        }
        else {

            first=first.next;
            first.previous=null;
        }
    }
    void popBack(){
        if (first==null){return;}
        else if(first.next==null){//only 1 element in list
            first=null;
            last=null;
        }
        else {

            last=last.previous;
            last.next=null;
        }

    }
}
