interface Computer {
    void debugCode();
}

class Desktop implements Computer{
    public void debugCode() {
        System.out.println("desktop debugging code");
    }
}

class Laptop implements Computer {
    public void debugCode() {
        System.out.println("laptop debugging code");
    }
}

class Developer {
    public void buildApp(Computer ref) {
        System.out.println("Building application");
        ref.debugCode();
    }
}

public class Main {

    public static void main(String[] args) {
        Computer obj = new Laptop();
        Developer dev = new Developer();
        dev.buildApp(obj);
    }   
}
