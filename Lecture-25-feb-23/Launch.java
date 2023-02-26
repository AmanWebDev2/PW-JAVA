import java.util.Scanner;

class Rectangle {
    float area;
    float length;
    float breadth;

    void input() {
        System.out.println("Enter details for Rectange");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of a rectangle: ");        
        length = scan.nextFloat();
        System.out.print("Enter the breadth of a rectangle: ");
        breadth = scan.nextFloat();
    }
    void compute() {
        area = length * breadth;
    }

    void display() {
        System.out.println("The area of Rectangle is "+ area);
    }
}

class Square {
    float area;
    float length;

    void input() {
        System.out.println("Enter details for square");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of a Square: ");
        length = scan.nextFloat();
    }
    void compute() {
        area = length * length;
    }

    void display() {
        System.out.println("The area of Square is "+ area);
    }
}

class Circle {
    float area;
    final float pi = 3.14f;
    float radius;

    void input() {
        System.out.println("Enter details for Circle");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        radius = scan.nextFloat();
    }
    void compute() {
        area = pi * radius * radius;
    }

    void display() {
        System.out.println("The area of Rectangle is "+ area);
    }
}

public class Launch {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.input();
        r.compute();
        r.display();
        Circle c = new Circle();
        c.input();
        c.compute();
        c.display();
        Square s = new Square();
        s.input();
        s.compute();
        s.display();
    }
}
