package main.questions.ques1;

public class Person {
    int age;
    String name;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Person person1 = new Person("Parth",19);
        Person person2 = new Person("Steve",34);
        System.out.println(person1.name + " is " + person1.age + " years old");
        System.out.println(person2.name + " is " + person2.age + " years old");
    }
}
