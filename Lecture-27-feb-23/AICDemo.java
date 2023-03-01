interface Car {
    void drive();
}

// class WagonR implements Car {
//     public void drive() {
//         System.out.println("driving");
//     }
// }


public class AICDemo {
    public static void main(String[] args) {
        // Car car = new WagonR();
        // car.drive();

        Car obj =  new Car() {
            public void drive() {
                System.out.println("Driving");
            }
        };
        obj.drive();
    }
}
