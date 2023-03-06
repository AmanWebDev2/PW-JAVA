class DemoException {

    void run() {
        int num1 = 12;
        int num2 = 34;
        int num[] = {1,23,45,6};
        int res = 0;
        try {
            res = num1 / num2;
            System.out.println(num[6]);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("cannot divide by zero");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("stay in limit");
        } catch(Exception e) {
            System.out.println("something went wrong "+ e);
        }

        System.out.println(res);
        System.out.println("bye");
    }
}


public class ExceptionDemo3 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 34;
        int res = 0;
        int num[] = {1,2,34,4};
        /* 
         * below code causes issue because we handle only Arithmetic exception, what if we got another exception, we have to handle those as well
        */
        try {
            res = num1 / num2;
            System.out.println(num[9]);  // also a critical statement
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("cannot divide by zero");
        }
        System.out.println(res);
        System.out.println("bye");
    }
}