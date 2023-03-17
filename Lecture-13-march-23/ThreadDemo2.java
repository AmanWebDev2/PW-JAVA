
/*
 * Thread class implements runnable interface, 
 * in runnable interface, it has a run method ( which is public abstract by default)
 * in Thread class we have lots of methods like run(), sleep(), wait(), join()
 */

class MyThread extends Thread {

    public void run() {
        System.out.println("myThread executed");
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        // to excute run() we have to call start method, which is going to register out thread in thread schedular( Thread Schedular manages all the threads )
        t.start();
    }    
}
