package com.saikat.oops;

public class Lecture1 {
    public static void main(String[] args) {
        Student S1 = new Student(12, 90.45f,"Bitan Sarkar");
        Student S2 = new Student();
        System.out.println(S1.name);
        System.out.println(S2.name);
        Student[] S3 = new Student[5];

    }
}
class Student{
    int roll;
    float marks;
    String name;
    static void PrintAllVal(){
        System.out.println("Name : "+this.name+"\nRoll");
    }
    Student(){
        name = "Saikat Bishal";
        this.marks = 35.56f;
        this.roll = 37;
    }
    Student(int roll, float marks, String name)
    {
        this.marks = marks;
        this.name = name;
        this.roll = roll;
    }

}
