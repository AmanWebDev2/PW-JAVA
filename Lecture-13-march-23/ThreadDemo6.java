import java.util.Scanner;

class Task extends Thread {

    public void run() {
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("CALC")) {
            calc();
        }else{
            message();
        }
    }

    void calc() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            System.out.println(num);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error "+e);
        }
    }

    void message() {
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("Task "+i);
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("error "+e);
            }
        }
    }
}

public class ThreadDemo6 {
    public static void main(String[] args) {
        Task t  = new Task();
        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(t);        

        thread1.setName("CALC");
        thread2.setName("MSG");

        thread1.start();
        thread2.start();
    }

}
