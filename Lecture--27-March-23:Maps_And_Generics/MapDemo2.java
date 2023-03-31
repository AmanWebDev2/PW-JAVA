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

        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(1,"linked one");
        lhm.put(null,"linked two");
        lhm.put(false,true);
        System.out.println(lhm);

        // map.get(<key>); // return object
        System.out.println(hm.get(null));
        System.out.println(lhm.get(1));
    }    
}

