package ex01;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"red");
        Cylinder cylinder = new Cylinder(4,"pink", 6);

        System.out.println(circle.getArea());
        System.out.println(cylinder.getArea());
    }
}
