package main.questions.ques16;

public class Rectangle extends Shape{
    float len;
    float breadth;

    public Rectangle(float len, float breadth) {
        this.len = len;
        this.breadth = breadth;
    }

    @Override
    float area() {
        return len*breadth;
    }

    @Override
    float perimeter() {
        return 2*(len+breadth);
    }
}
