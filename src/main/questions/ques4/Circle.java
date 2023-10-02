package main.questions.ques4;
/*4. Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.*/
public class Circle {
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }
    float circum(){
        return (float) (2 * Math.PI * radius);
    }
    float area(){
        return (float) (Math.PI*radius*radius);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        System.out.println(circle1.area() + "\n" + circle1.circum());
    }
}
