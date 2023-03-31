import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.*;

class MyThread implements Runnable {
    ArrayList al = new ArrayList(); 
    int [] arr = new int[5];
   

    public void run() {
        String currThreadName = Thread.currentThread().getName();
        if(currThreadName.equals("FAIL_SAFE")) {
            failSafe();
        }else {
            failFast();
        }
    }

    synchronized void failFast() {
        // fail fast
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        Iterator itr = al.iterator();
        try {
            while(itr.hasNext()) {
            System.out.println(itr.next());
            al.add(100); // concurrentModificationException
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }

    synchronized void failSafe() {
        CopyOnWriteArrayList cwoal = new CopyOnWriteArrayList<>();
        cwoal.add(10);
        cwoal.add(20);
        cwoal.add(30);
        cwoal.add(40);

        Iterator itr1 = cwoal.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
            cwoal.add(100);
        }
    }
}

public class FailFast_FailSafe {
    int [] arr = new int[5];
   
    public static void main(String[] args) {

        // for(int i=0; i<al.size(); i++) {
        // System.out.println(al.get(i));
        // al.add(100); // infinte loop bacause concurrent modification
        // }

        // so to run above code without exception
        MyThread t = new MyThread();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.setName("FAIL_FAST");
        t2.setName("FAIL_SAFE");        

        t1.start();
        t2.start();


    }

}
