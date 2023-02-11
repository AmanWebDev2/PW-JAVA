import java.util.Scanner;

public class PlindromeString {
    
    String inputVal;
    String str = "";
    String rev = "";

    void takeInputFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value: ");
        inputVal = scan.next();
        System.out.println(inputVal.getClass().getSimpleName() );
        if(inputVal.getClass().getSimpleName().equals("String")) {
            str = inputVal;
        }else {
            System.out.println("Enter only string type");
            takeInputFromUser();
        }
    }
    
    void palindrome() {
        for(int i=str.length()-1; i>=0; i--) {
            rev += str.charAt(i);
        }
        if(str.equals(rev)) {
            System.out.println("Given string is palindrome");
        }else {
            System.out.println("Given string is not a palindrome");
        }
    }
    
    public static void main(String[] args) {
        PlindromeString p = new PlindromeString();
        p.takeInputFromUser();
        p.palindrome();
    }
}
