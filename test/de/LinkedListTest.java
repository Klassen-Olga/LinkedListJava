package de;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    @Test
    void should_return_0(){
        //Given
        LinkedList list=new LinkedList();
        //When
        int size=list.size();
        //then
        assertEquals(0, size);
    }
    @Test
    void should_return_1(){
        //Given
        LinkedList list=new LinkedList();
        Node node=new Node();
        list.pushFront(node);
        //when
        int size=list.size();
        //then
        assertEquals(1, size);
    }
    @Test
    void should_return_6(){
        //Given
        LinkedList list=new LinkedList();
        for(int i=0; i<6; i++){
            Node node=new Node();
            list.pushFront(node);

        }
        //when
        int size=list.size();
        //then
        assertEquals(6, size);
    }
    @Test
    void should_return_2(){
        //Given
        LinkedList list=new LinkedList();
        for(int i=0; i<3; i++){
            Node node=new Node();
            list.pushFront(node);

        }
        list.popFront();
        //when
        int size=list.size();
        //then
        assertEquals(2, size);

    }
}
