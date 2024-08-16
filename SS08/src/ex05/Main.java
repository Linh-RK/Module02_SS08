package ex05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dien thich hinh tron"+ StaticMethod.calCircleArea(3.5));
        System.out.println("Dien thich hinh tron"+ StaticMethod.calCircleArea(6));
        System.out.println("Dien thich hinh chu nhat"+ StaticMethod.calRectangleArea(2.5, 6));
        System.out.println("Dien thich hinh chu nhat"+ StaticMethod.calRectangleArea(4, 7));
        System.out.println("Dien thich hinh tam giac"+ StaticMethod.calTriangleArea(3, 4, 5));
        System.out.println("Dien thich hinh tam giac"+ StaticMethod.calTriangleArea(4.5, 7, 6));
    }
}
