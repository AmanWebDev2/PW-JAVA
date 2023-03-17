import java.util.Scanner;

class Calc extends Thread {

    public void run() {
        System.out.println("Calculation task started");
        try(
        Scanner scan = new Scanner(System.in);
        
        ) {
            int num = scan.nextInt();
            System.out.println("enter any num");
            System.out.println("you entered "+ num);
        }catch(Exception e) {
            System.out.println("error "+e);
        }
    
    }

}

class Message extends Thread {

    public void run() {
        System.out.println("Message task started");
        for (int i = 0; i < 3; i++) {
            System.out.println("some task");
        }
    }

}


public class ThreadDemo3 {
    public static void main(String[] args) {
        System.out.println("Main thread");

        Calc t1 = new Calc();
        Message t2 = new Message();

        // as a programmer we don't know which start starts first
        // thread schedular schedule below tasks

        t1.start();
        t2.start();
    }
}
