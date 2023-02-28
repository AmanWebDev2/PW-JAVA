interface A {
    void show();
    default void config(){
        System.out.println("default method config");
    };
    static void abc() {
        System.out.println("static method abc");
    }
}

class B implements A {
    public void show() {
        System.out.println("In show");
    }
    // we can override config
    // public void config() {
    //     System.out.println("override");
    // }
}


public class Java8Feature {
    public static void main(String[] args) {
        A.abc();
        A obj = new B();
        obj.config();
        // obj.abc(); // cannot call static method of interface
    }
}
