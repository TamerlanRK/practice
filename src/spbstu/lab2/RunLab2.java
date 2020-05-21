package spbstu.lab2;

public class RunLab2 {

    public static void main(String[] args) {
        Circle objectCircle1 = new Circle(10);
        Circle objectCircle2 = new Circle(20);

        System.out.format("Площадь круга objectCircle1: %.1f%n", objectCircle1.computeArea());
        System.out.format("Площадь круга objectCircle2: %.1f%n", objectCircle2.computePerimeter());

        Rectangle objectRectangle1 = new Rectangle(20, 40);
        Rectangle objectRectangle2 = new Rectangle(10, 50);

        System.out.format("Площадь прямоугольника objectRectangle1: %.1f%n", objectRectangle1.computeArea());
        System.out.format("Площадь прямоугольника objectRectangle2: %.1f%n", objectRectangle2.computePerimeter());

        Triangle objectTriangle1 = new Triangle(15, 40, 50);
        Triangle objectTriangle2 = new Triangle(40, 44, 30);

        System.out.format("Площадь треугольника objectTriangle1: %.1f%n", objectTriangle1.computeArea());
        System.out.format("Площадь треугольника objectTriangle2: %.1f%n", objectTriangle2.computePerimeter());
    }
}
