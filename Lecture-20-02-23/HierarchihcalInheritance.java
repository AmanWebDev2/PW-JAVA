class Animal {
    void display() {
        System.out.println("Display behaviour in Animall class");
    }
}

class Tiger extends Animal {

}

class Deer extends Animal {

}

class Monkey extends Animal {

}

public class HierarchihcalInheritance {
    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.display();    
    }
}
