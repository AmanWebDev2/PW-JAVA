import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    String str1 = "";
    String str2 = "";

    private void takeInputFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        str1 = scan.nextLine();
        System.out.print("Enter string 2: ");
        str2 = scan.nextLine();
    }

    void step1() {
        // check if string includes spaces if include then remove it;
        if(str1.contains(" ")){
            //str1 is immutable so we have to give reference of new strin
            str1 = str1.replace(" ", "");
        }
        if(str2.contains(" ")) {
            str2 = str2.replace(" ", "");
        }
        step2();
    }

    void step2() {
        // convert string either in lowercase or uppercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        step3();
    }

    void step3() {
        // store it in a character array
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        step4(char1,char2);
    }

    void step4(char[] char1, char[] char2) {
        // sort 
        Arrays.sort(char1);
        Arrays.sort(char2);

        step5(char1,char2);
    }

    void step5(char[] char1,char[]char2) {
        // compare two character array
        if(Arrays.equals(char1, char2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not an Anagram");
        }
    }

    void start() {
        takeInputFromUser();
        step1();
    }


    public static void main(String[] args) {
        Anagram p1 = new Anagram();
        p1.start();

    }    
}
