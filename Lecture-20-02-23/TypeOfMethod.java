class Aeroplane {

    void takeOff() {
        System.out.println("Aeroplane take off");
    }

    void fly() {
        System.out.println("Aeroplane flies");
    }
}

class CargoPlane extends Aeroplane {

    // overriden method
    void fly() {
        System.out.println("Cargoplane flies");
    }

    // specialized method: not present in parent class
    void carryGood() {
        System.out.println("Cargoplane carries good");
    }
}

class PassengerPlane  extends Aeroplane {

    // overriden method
    void fly() {
        System.out.println("Passenger plane flies");
    }

    // specialized method: not present in parent class
    void carryPassenger() {
        System.out.println("Passenger plane carries passengers");
    }
}

public class TypeOfMethod {
    public static void main(String[] args) {

        Aeroplane a = new Aeroplane();
        a.fly();
        a.takeOff();

        CargoPlane cp = new CargoPlane();
        cp.carryGood();
        cp.fly();

        PassengerPlane p = new PassengerPlane();
        p.carryPassenger();
        p.fly();
    }
}
