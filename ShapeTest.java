abstract class Shape {
    abstract double area();
}

interface Drawable {
    void draw();
}

class Circle extends Shape implements Drawable {
    double rad = 5;

    public double area() {
        return Math.PI * rad * rad;
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape implements Drawable {
    double len = 5, width = 7;

    public double area() {
        return len * width;
    }

    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());
    }
}
