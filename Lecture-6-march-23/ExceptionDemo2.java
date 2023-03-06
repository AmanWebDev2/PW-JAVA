/*
 * try catch
 * two types of statement
 * 1. normal
 * 2. critical
 */

 public class ExceptionDemo2 {
    public static void main(String[] args) {
        // normal statement
        int num1 = 1;
        int num2 = 0;
        int res = 0;
        try {
            // critical statement
            res = num1 / num2;
            System.out.println("inside try");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("something went wrong "+e);
        }
        System.out.println(res);

    }
 }