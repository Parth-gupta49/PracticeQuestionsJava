package main.questions.ques16;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 12);
        Shape circle = new Circle(5);
        Shape triangle = new Triangle(7, 8, 6,6);
        System.out.println(rectangle.area() + "\n" + rectangle.perimeter());
        System.out.println();
        System.out.println(circle.area() + "\n" + circle.perimeter());
        System.out.println();
        System.out.println(triangle.area() + "\n" + triangle.perimeter());
    }
}
