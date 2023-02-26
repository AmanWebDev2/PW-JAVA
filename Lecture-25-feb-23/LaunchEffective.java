import java.util.Scanner;

abstract class Shape {
    float area;
    abstract void input();
    abstract void compute();
    void display() {
        System.out.println("The area is "+area);
    }
}

class Rectangle extends Shape {
    float length;
    float breadth;

    void input() {
        System.out.print("Details for Rectange");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of a rectangle: ");
        length = scan.nextFloat();
        System.out.print("Enter the breadth of a rectangle: ");
        breadth = scan.nextFloat();
    }
    void compute() {
        area = length * breadth;
    }
}   

class Circle extends Shape {
    final float pi = 3.14f;
    float radius;
    void input() {
        System.out.println("Enter details for circle: ");
        Scanner scan = new Scanner(System.in);
        radius = scan.nextFloat();
    }
    void compute() {
        area = pi * radius * radius;
    }
}

class Square extends Shape {
    float length;

    void input() {
        System.out.println("Enter details for square");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of a square: ");
        length = scan.nextFloat();
    }
    void compute() {
        area = length * length;
    }
}

class Geometry {
    void poly(Shape ref) {
        ref.input();
        ref.compute();
        ref.display();
    }
}

public class LaunchEffective {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Square sq = new Square();
        Circle c = new Circle();

        Geometry g = new Geometry();
        g.poly(r);
        g.poly(sq);
        g.poly(c);
    }    
}
