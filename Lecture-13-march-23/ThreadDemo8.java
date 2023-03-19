class Printing implements Runnable {

    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
            Thread.sleep(2000);
                System.out.println("Focus is important");                
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error "+e);
        }
    }
}

public class ThreadDemo8 {
    public static void main(String[] args) {
        System.out.println("main thread started");
        Printing p = new Printing();
        Thread t = new Thread(p);
        System.out.println(t.isAlive()); //false
        t.start();
        System.out.println(t.isAlive()); //true
        try {
            t.join();            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error "+e);
        }
        System.out.println("main thread completed the work");
    }
}
