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
        System.out.println(ll2.get(0));
        System.out.println(ll2.indexOf(2333));
        System.out.println(ll2.contains(true));
        System.out.println(ll2.getLast());
        System.out.println(ll2.getFirst());
        System.out.println(ll2.peek()); // return first obj
        ll2.push("pushed");
        ll2.pop();
        System.out.println(ll2);

        System.out.println(ll2.poll()); // return first obj but remove from collection
        System.out.println(ll2);

        List ll3 = new LinkedList();
        Deque ll4 = new LinkedList();
        //  the only problem is now we cannot access linkedlist method 
        // because Parent type reference cannot access specialised method



    }
}
