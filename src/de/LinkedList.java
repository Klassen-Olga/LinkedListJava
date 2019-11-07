package de;

public class LinkedList<T> {
    private Node first;
    private Node last;
    private int size;

    LinkedList() {
        first = null;
        last = null;
        size=0;
    }

    public void pushFront(T data) {
        Node<T> node = new Node<>(data);

        if (first == last && first == null) {
            first = node;
            last = node;

        } else {
            first.previous = node;
            node.previous = null;
            node.next = first;
            first = node;
        }
        size++;
    }

    public void pushBack(T data) {
        Node<T> node = new Node<>(data);
        if (first == last && first == null) {
            first = node;
            last = node;

        } else {
            node.next = null;
            node.previous = last;
            last.next = node;
            last = node;
        }
        size++;
    }

    public int size() {

        return size;
    }

    public void popFront() {
        if (first == null) {
            return;
        } else if (first.next == null) {//only 1 element in list
            first = null;
            last = null;
        } else {

            first = first.next;
            first.previous = null;
        }
        size--;
    }

    public void popBack() {
        if (first == null) {
            return;
        } else if (first.next == null) {//only 1 element in list
            first = null;
            last = null;
        } else {

            last = last.previous;
            last.next = null;
        }
        size--;
    }
}
