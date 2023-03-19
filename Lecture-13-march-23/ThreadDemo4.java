import java.util.Scanner;

class Calc1 implements Runnable {
    public void run() {
        System.out.println("Calc1 started");
        try (Scanner scan = new Scanner(System.in)){
            int num = scan.nextInt();
            System.out.println(num);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error "+e.getMessage());
        }
    }
}


class Message1 implements Runnable{
     public void run() {
        System.out.println("Message1 started");
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(2000);
                System.out.println("some tasks");
            }        
                
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error "+e);
        }
     }
}

public class ThreadDemo4 {
    public static void main(String[] args) {
    Calc1 c1 = new Calc1();
    Message1 m1 = new Message1();       
    
    Thread t1 = new Thread(c1);
    Thread t2 = new Thread(m1);

    t1.start();
    t2.start();

    }
}