package de;

public class Louncher {
    public static void main(String[] args) {//cntrl alt l


        LinkedList<Integer> list = new LinkedList();

        int size = list.size();
        list.pushFront(1);
        size = list.size();

        list.pushFront(2);
        size = list.size();
        list.pushFront(3);
        size = list.size();
        list.pushFront(4);
        list.pushBack(5);
        size = list.size();
    }
}
