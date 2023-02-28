interface A {
    void showA();
}

interface B{
    void showB();
}

class X implements A,B {
     public void showA() {
        System.out.println("show A");
    }

    public void showB() {
        System.out.println("show B");
    }
}

class Interface {
    public static void main(String[] args) {
        // X obj = new X();
        // obj.showA();
        // obj.showB();

        A obj = new X();
        obj.showA();
        // obj.showB(); // cannot access only acces A methods
    }
}