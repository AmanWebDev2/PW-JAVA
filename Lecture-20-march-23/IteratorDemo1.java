import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.println("**************using iterator**************");
        // iterate - like a cursor
        Iterator itr = al.iterator();
        while(itr.hasNext()) {
            Object obj = itr.next();
            System.out.println(obj);
        }

        System.out.println("**************using list iterator**************");
        // listIterator - works only with list type (linkedList, arrayList)
        // it can tranvese from rear end
        ListIterator litr = al.listIterator(al.size());
        while(litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        System.out.println("**************using for loop**************");
        // we can also use for loop but in most of the collection there is no index based accessing of element like in PriorityQueue, ArrayDequeue
        for(int i=0; i<al.size(); i++) {
            Object obj = al.get(i);
            System.out.println(obj);
        }
        
        System.out.println("**************using foreach**************");
        // forEach loop
        for(Object obj:al) {
            System.out.println(obj);
        }
        
    }
}
