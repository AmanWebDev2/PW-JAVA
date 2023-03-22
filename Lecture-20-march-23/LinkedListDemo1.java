import java.util.*;
/*
 * it implements both List and Dequeue interface
 * it stores object as a node
 * it follow doubly linkedList data structure
 * order of sequence is perserved
 * very efficient -> retrieve, deletion, insertion, at any given index
 */

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();

        ll1.add(10);
        ll1.add(20);
        ll1.add(true);

        LinkedList ll2 = new LinkedList();
        ll2.add("linkedList2");
        ll2.addAll(ll1);
        System.out.println(ll2);

        System.out.println(ll2.peek()); // return first obj
        System.out.println(ll2);

        System.out.println(ll2.poll()); // return first obj but remove from collection
        System.out.println(ll2);

    }
}
