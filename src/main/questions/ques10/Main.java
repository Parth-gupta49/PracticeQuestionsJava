package main.questions.ques10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(90,"Parth Gupta");
        ArrayList<String> myCourses = student1.returnCourses();
        student1.addCourse("Maths");
        student1.addCourse("Physics");
        student1.addCourse("Chemistry");
        System.out.println(myCourses);
        student1.addCourse("Chemistry");
        student1.removeCourse("Chemistry");

        System.out.println(myCourses);
    }
}
