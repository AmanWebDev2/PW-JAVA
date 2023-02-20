class Animal {

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Tiger extends Animal {

}



public class SingleLevelInheritance {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.sleep();    
    }
}
