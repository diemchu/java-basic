package JavaOOP.JavaCollectionFramework.CollectionPackage.QueueCollection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExtendsQueue {
    public static void main(String[] args) {
        Queue<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("Java");
        linkedList.offer("My");
        linkedList.poll(); // "Hello" 선이선출"
        System.out.println(linkedList.element());
        System.out.println(linkedList);

        //=============================================
        System.out.println("doubly linkedList");
        LinkedList<Integer> doublyLinkedList = new LinkedList<>();
        doublyLinkedList.add(10);
        doublyLinkedList.addFirst(20);
        doublyLinkedList.addLast(20);
        System.out.println("index of 1: "+doublyLinkedList.indexOf(20));
        System.out.println("20 contains: "+doublyLinkedList.contains(20));
        System.out.println(doublyLinkedList);
    }
}
