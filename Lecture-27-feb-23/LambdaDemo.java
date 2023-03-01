
@FunctionalInterface // optional
interface Car {
    void drive(int avg);
}

public class LambdaDemo {
    public static void main(String[] args) {
        Car obj = (avg) -> System.out.println("Driving "+avg);
        obj.drive(12);
        
    }
}
