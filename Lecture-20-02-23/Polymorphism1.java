
class Aeroplane {
    
    public void fly() {
        System.out.println("Aeroplane flies");
    }

    public void takeOff() {
        System.out.println("Aeroplane takes off");
    }
}

class CargoPlane extends Aeroplane {

    public void fly() {
        System.out.println("Cargo plane flies");
    }

    public void takeOff() {
        System.out.println("Cargo plane takes off");
    }

}

class PassengerPlane extends Aeroplane {

    public void fly() {
        System.out.println("PassengerPlane plane flies");
    }

    public void takeOff() {
        System.out.println("PassengerPlane plane takes off");
    }

}

public class Polymorphism1 {
    public static void main(String[] args) {
        
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();

        // we can do thid
        // cp = pp;

        // but we can ref child to parent  
        Aeroplane ref;
        ref = cp;
        ref.fly();
        ref.takeOff();
        System.out.println("-------------");
        ref = pp;
        ref.fly();
        ref.takeOff();
    }   
}
