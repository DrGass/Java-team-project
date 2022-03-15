package com.company.zajecia_02;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number- ");
        int x = sc.nextInt();

            try {
                TestingFirstEx.validateAge(x);
            } catch (InvalidAgeException | InvalidPersonException | YoureInvalidExDception e) {
                e.printStackTrace();
            }
            finally{
                System.out.println("Block Exectued");
            }
    }

}
