// car has a engine
class Car  {
    private Engine eng;

    Car(Engine eng) {
        this.eng = eng;
    }

    void start() {
        eng.startEngine();
    }
    
    void setEngine(Engine eng) {
        this.eng = eng;
    }

}

class Engine {

    void startEngine() {
        System.out.println("Car is starting");
    }

}

public class HasA {
    public static void main(String[] args) {
        Engine e = new Engine();
        Car c = new Car(e); // constructor injection
        c.setEngine(e); //setter injection
        c.start();    
    }
}
