package main.questions.ques16;

public class Circle extends Shape{
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    float area() {
        return (float)Math.PI*radius*radius;
    }

    @Override
    float perimeter() {
        return (float) Math.PI*2*radius;
    }

}
