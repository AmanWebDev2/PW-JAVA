import java.util.Scanner;

public class Pangram {
    String str = "";
    boolean flag = false;
    void checkPangram() {
        // remove white spaces
        if(str.contains(" ")) {
            str = str.replace(" ", "");
        }
        // convert to either lower or uppercase
        str = str.toUpperCase();

        // create a charater array
        char[] ch = str.toCharArray();

        // create int array of size 26
        int[] arr = new int[26];

        // iterate over char array and make changes to int array
        for (int i = 0; i < ch.length; i++) {
            arr[ch[i]-65]++;
        }

        // check if int array contains zero
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                flag = true;
            }
        }

        if(flag) {
            System.out.println("It is not a pangram");
        }else{
            System.out.println("It is pangram");
        }
        
    }
    void takeInputFromUser(){
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
    }

    public static void main(String[] args) {
        // String str = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        Pangram p = new Pangram();
        p.takeInputFromUser();
        p.checkPangram();

    }
}
