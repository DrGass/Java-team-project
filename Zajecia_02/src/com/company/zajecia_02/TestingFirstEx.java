package com.company.zajecia_02;

public class TestingFirstEx {
    static void validateAge(int age) throws InvalidAgeException, InvalidPersonException, YoureInvalidExDception {
        if(age < 18) throw new InvalidAgeException("age is too low");
        if(age > 25) throw new InvalidPersonException("age is too high");
        if(age == 23) throw new YoureInvalidExDception("You're Invalid XDD");
        else System.out.println("welcome in program");


    }
}
