class Person {
    String name;
    int age;
    Address add;

    class Address {
        String city;
        int pincode;
        String state;
    }
}


class A {
    public void display(){
        System.out.println("inside inside class A");
    }

    // inner class
    class B {
        public void display() {
            System.out.println("inside class B");
        }
    }

    static class C {
        public void display() {
            System.out.println("inside static class C");
        }
    }
}


public class InnerDemo {
    public static void main(String ...args) {
        A obj = new A();
        obj.display();

        // now to access class b methods --> have to create object of class B
        A.B obj1 = obj.new B();
        obj1.display();

        // static class 
        A.C obj2 = new A.C();
        obj2.display();

        /*
         * there are two member inside class A
         * 1. method
         * 2. class B
         */
    }
}