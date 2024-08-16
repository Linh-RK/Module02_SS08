package ex04;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape("blue");
        System.out.println("Nhap mau tam giac");
        String triangleColor = scanner.nextLine();
        System.out.println("nhap canh 1 cua tam giac");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap canh 2 cua tam giac");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap canh 3 cua tam giac");
        double side3 = Double.parseDouble(scanner.nextLine());
        Triangle triangle = new Triangle(triangleColor,side1, side2,side3 );

        System.out.println(shape.toString());;
        System.out.println(triangle.toString());
    }
}
