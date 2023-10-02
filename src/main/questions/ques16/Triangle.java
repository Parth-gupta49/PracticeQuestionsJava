package main.questions.ques16;

public class Triangle extends Shape{
    float side1;
    float side2;
    float base;
    float height;

    public Triangle(float side1, float side2, float base, float height) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.height = height;
    }

    @Override
    float area() {
        return  (0.5f * base * height);
    }

    @Override
    float perimeter() {
        return side1 + side2 + base;
    }
}
