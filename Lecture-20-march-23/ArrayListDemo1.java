import java.util.*;

/*
    It implements List interface
 * data stored in sequence (order of sequence is preserved/retained)
 * duplication allowed
 * can store heterogenous data
 * index based insertion is allowed but not preferred (not optimized)
 * by default insertion happen in rear end ( at last )
 */

public class ArrayListDemo1 {
    public static void main(String[] args) {        
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(10);
        al1.add(20);
        al1.add(true);
        al1.add(2,"index based insertion");
        System.out.println(al1);
        System.out.println("*****************************");
        ArrayList al2 = new ArrayList();
        al2.add("Pw");
        // al2.add(al1);
        al2.addAll(al1);
        System.out.println(al2);

    }
}
