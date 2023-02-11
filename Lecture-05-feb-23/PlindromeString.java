import java.util.Scanner;

public class PlindromeString {
    String str = "";
    String rev = "";

    void takeInputFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value: ");
        str = scan.next(); //string
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
