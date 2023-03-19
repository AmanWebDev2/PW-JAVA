import java.util.Scanner;

/*
 * By using runnable interface we can extend another class but 
 * if we create a thread by extending thread class, we cannot extend another class
 * Multiple inheritance is not possible in JAVA
 */

class Demo {
    void doSomething() {
        System.out.println("doing something");
    }
}

class Calc extends Demo implements Runnable {
    public void run() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("enter a number");
            int num = scan.nextInt();
            System.out.println(num);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error "+e);
        }
        System.out.println("after try catch");
    }
}


class ThreadDemo5 {
    public static void main(String ...args) {
        Calc c = new Calc();
        Thread t = new Thread(c);
        t.start();
    }
}