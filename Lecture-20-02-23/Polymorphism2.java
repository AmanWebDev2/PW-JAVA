
class Aeroplane {

    void takeOff() { }
    void fly() { }
}

class CargoPlane extends Aeroplane {
    void takeOff() { }
    void fly() { }
}

class FighterPlane extends Aeroplane {
    void takeOff() { }
    void fly() { }
}

class PassengerPlane extends Aeroplane {
    void takeOff() { }
    void fly() { }
}



public class Polymorphism2 {

    public void polymorphism(Aeroplane ref)  {
        ref.fly();
        ref.takeOff();
    }
    public static void main(String[] args) {

        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Polymorphism2 p = new Polymorphism2();
        p.polymorphism(fp);
        p.polymorphism(cp);
        p.polymorphism(pp);


    }
}
