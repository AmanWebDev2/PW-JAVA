// Custom Exception and throw keyword

class CustomException extends Exception {

    public CustomException() { }
    public CustomException(String msg) { 
        super(msg);
    }
}

public class ExceptionDemo6 {
    public static void main(String[] args) {
        
        int num1 = 12;
        int num2 = -23;

        try {
            if(num2 < 0) {
                // Exception e = new ArithmeticException("Negative number");
                // throw e;

                // custom exception
                CustomException exc = new CustomException("Negative number");
                throw exc;
            }else {
                int res = num1/num2;
                System.out.println(res);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
