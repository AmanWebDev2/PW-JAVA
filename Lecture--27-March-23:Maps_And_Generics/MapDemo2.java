import java.util.*;

// HashMap vs LinkedHashMap

/*
 * HashMap
 * order of insertion is not retained
 * non-sync
 */

 /*
  * LinkedHashMap
  * order of insertion is retained
  */
public class MapDemo2 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(null,null);
        hm.put(3,false);
        System.out.println(hm);
        System.out.println("*************************************");

        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(1,"linked one");
        lhm.put(null,"linked two");
        lhm.put(false,true);
        System.out.println(lhm);

        // map.get(<key>); // return object
        System.out.println(hm.get(null));
        System.out.println(lhm.get(1));
        System.out.println("*************************************");
        //  getting all the keys
        Set keySet = hm.keySet();
        // set -> iterator
        // System.out.println(keySet); [null,1,2,3]
        Iterator itr = keySet.iterator();
        while(itr.hasNext()) {
            Object key = itr.next();
            System.out.println(key);
        }
        System.out.println("*************************************");
        Collection values = hm.values();
        Iterator itr2 = values.iterator();
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        System.out.println("*************************************");
        // getting key-value
        Set entrySet = hm.entrySet();
        Iterator itr3 = entrySet.iterator();
        while(itr3.hasNext()) {
            System.out.println(itr3.next());
        }
    }    
}

