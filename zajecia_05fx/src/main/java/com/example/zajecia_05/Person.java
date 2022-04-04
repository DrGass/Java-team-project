package com.example.zajecia_05;

public class Person {
    private String name;
    private String surname;
    private String age;

    public Person(String name, String surname, String age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
     public String toString(){
        return name + " " + surname + "\n" + "age: " + age;
    }

}
class Student extends Person {
    private String specialization;


    public Student(String name, String surname, String age, String specialization) {
        super(name, surname, age);
        this.specialization = specialization;
    }

    @Override
    public String toString(){
        return super.toString() + "\n specialization: " + specialization;
    }
}
