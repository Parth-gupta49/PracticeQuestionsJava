package main.questions.ques10;

import java.util.ArrayList;

/*10. Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.*/
public class Student {
    int grade;
    String name;
    ArrayList<String> courses;

    public Student(int grade, String name) {
        this.grade = grade;
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public void addCourse(String course){
        int check = 0;
        for (String cour : courses) {
            if (cour.equals(course)) {
                check = 1;
                break;
            }

        }
        if (check!=1)
            courses.add(course);
        else
            System.out.println("Course already present");

    }
    public void removeCourse(String course){
        int check = 0;
        for (String cour : courses) {
            if (cour.equals(course)) {
                check = 1;
                break;
            }

        }
        if (check==1)
            courses.remove(course);
        else
            System.out.println("Course not present");
    }
    public ArrayList<String> returnCourses(){
        return courses;
    }

}
