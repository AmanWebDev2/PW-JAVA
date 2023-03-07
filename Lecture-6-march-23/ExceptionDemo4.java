import java.util.InputMismatchException;
import java.util.Scanner;

class DemoExc {

    void run() {
        int num = 0;
        // try with resource
        try (Scanner scan = new Scanner(System.in)){
            num = scan.nextInt();            
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("Enter a number");
        }
        System.out.println(num);
    }
}

public class ExceptionDemo4 {
    public static void main(String[] args) {
        int num = 0;
        // created a resource
        Scanner scan = new Scanner(System.in);
        try {
            // used
            num = scan.nextInt();
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("Enter a number");

        }finally {
            // finally block runs weather the code compile or give error
            // close resource
            scan.close();
        }
        System.out.println(num);
    }
}
