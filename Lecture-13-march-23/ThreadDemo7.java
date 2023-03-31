
/*
 * State of a thread
 * 1. New   ( when create a new thread )
 * 2. Runnable  ( threadSchedular schedule a thread )
 * 3. Running ( when run body is executing )
 * 4. Blocked ( when thread encounters sleep(), wait() etc method )
 * 5. Dead ( when task is completed )
 */

class Demo1 implements Runnable {

    public void run() {
        System.out.println("Child thread executing");
        try {
            Thread.sleep(3000); //blocked
        } catch (Exception e) {
            System.out.println("error "+e);
        }
        System.out.println("child thread task complete");
    }
}


public class ThreadDemo7 {
    public static void main(String[] args) {
        System.out.println("main thread started");
        Demo1 d1 = new Demo1(); 
        Thread t =new Thread(d1); // new
        t.start(); // runnable
    }
}
