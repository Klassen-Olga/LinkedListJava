package de;

public class Louncher {
    public static void main(String[] args) {

        Integer node1=new Integer(1);
        Integer node2=new Integer(2);
        Integer node3=new Integer(3);
        Integer node4=new Integer(4);
        Integer node5=new Integer(5);
        LinkedList<Integer> list=new LinkedList();

        int size=list.size();
        list.pushFront(node1);
        size=list.size();

        list.pushFront(node2);
        size=list.size();
        list.pushFront(node3);
        size=list.size();
        list.pushFront(node4);
        list.pushBack(node5);

    }
}
