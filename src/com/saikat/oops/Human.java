package com.saikat.oops;

public class Human {
    int age;
    int salary;
    boolean married;
    String name;
    static long population;
    public Human(int age, int salary, boolean married, String name) {
        this.age = age;
        this.salary = salary;
        this.married = married;
        this.name = name;
        Human.population += 1;
    }


}
