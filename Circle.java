package day11;

public class Circle {
    public double radius;
    public Circle(double r) {
        radius = r;
    }
    public Circle() {
        radius = 5;
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + circumference());
    }
      
}
