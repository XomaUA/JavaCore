package com.company;
abstract class Person {
    public String name;
    public abstract void print();
}
abstract class Staff extends Person {
    public void print() {
        System.out.println("I am " + TYPE_PERSON);
    }
    public abstract void salary();
    public final String TYPE_PERSON = "Staff";

}
class Teacher extends Staff{
    public void print(){
        System.out.println("I am " + TYPE_PERSON + " " + name);
    }
    public final String TYPE_PERSON = "Teacher";
    public void salary(){
        System.out.println(1700);
    }
    public String name = "Valera";
}
class Cleaner extends Staff {
    public void print() {
        System.out.println("I am " + TYPE_PERSON + " " + name);
    }
    public final String TYPE_PERSON = "Cleaner";
    public void salary() {
        System.out.println(1800);
    }
    public String name = "Petro";
}
class Student extends Person{
    public void print(){
        System.out.println("I am " + TYPE_PERSON + " " + name);
    }
    public final String TYPE_PERSON = "Student";
    public String name = "Misha";
}
public class Main {

    public static void main(String[] args) {

Person[] per = new Person[3];
per[0] = new Student();
per[1] = new Cleaner();
per[2] = new Teacher();

per[0].print();
per[1].print();
per[2].print();


    }
    }

