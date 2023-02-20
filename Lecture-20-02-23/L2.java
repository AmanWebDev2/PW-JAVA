class Human {
    int age;
    private String name;

    Human() {
        System.out.println("Human constructor");
    }

    void sleep() {
        age = 18;
        System.out.println("Parent Class");
        System.out.println("Parent class: "+age);
    }
}

class Student extends Human {

    // default student constructor is created
    // Student () {
    // super() // call parent constructor 
    // }

    void display() {
        System.out.println("Child class : "+age);
        // System.out.println("Child class :"+ name); // cannot access private memeber of super class
    }
}

public class L2 {
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();
        st.display();

        // output
        /*
         *
        Human constructor  
        Parent Class
        Parent class: 18
        Child class : 18
         */
    }
}
