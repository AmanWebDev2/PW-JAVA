/*
 * interrupt() method only works when thread is in blocked / waiting state
 */

class Example implements Runnable {

    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("focus is important");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println("Thread is interrupted");
            }
        }

    }
}

public class ThreadDemo9 {
    public static void main(String[] args) {

        Example ex = new Example();

        Thread t = new Thread(ex);

        t.start();
        t.interrupt();

    }
}