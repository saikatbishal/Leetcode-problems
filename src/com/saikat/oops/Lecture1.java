package com.saikat.oops;
import static com.saikat.backtracking.FindPaths.findNumberOfPath;
public class Lecture1 {
    public static void main(String[] args) {
        Student S1 = new Student(12, 90.45f,"Bitan Sarkar");
        Student S2 = new Student();
        System.out.println(S1.name);
        System.out.println(S2.name);
        System.out.println(findNumberOfPath(10,10));
        Student.PrintAllVal(S1);
        Human bittu = new Human(24,20000,true,"Saikat Bishal");
        Human cittu = new Human(19,5000,false,"Amit Dey");
        System.out.println(Human.population);
    }
}
class Student{
    int roll;
    float marks;
    String name;
    static void PrintAllVal(Student s1){
        System.out.println("Name : "+s1.name+"\nRoll : "+s1.roll+"\nmarks : "+s1.marks);
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
