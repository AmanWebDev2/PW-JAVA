
class Demo1 { // extends Object

    void display() {
        System.out.println("Display method in Demo 1");
    }
}

class Demo2 extends Demo1 {

}

class Demo3 extends Demo2 {

}


public class MultilevelInheritance {
    public static void main(String[] args) {
        Demo3 d3 = new Demo3();
        d3.display();
    }
}
