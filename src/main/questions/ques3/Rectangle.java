package main.questions.ques3;
/*Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.*/
public class Rectangle {
    float breadth;
    float length;
    float perimeter(){
        return 2 * (this.length + this.breadth);
    }
    float area(){
        return this.length*this.breadth;
    }

    public Rectangle(float breadth, float length) {
        this.breadth = breadth;
        this.length = length;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(7,12);
        System.out.println("The area is : " + rectangle1.area() + " \n The perimeter is : " + rectangle1.perimeter());
    }
}
