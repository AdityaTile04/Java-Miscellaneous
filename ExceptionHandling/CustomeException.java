package ExceptionHandling;

import java.util.Scanner;

public class CustomeException {

    // example 1
    static void ageChecker(int age) throws AgeException {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the age : ");
        age = sc.nextInt();
        if(age < 18) {
            throw new AgeException("Not Eligible");
        } else {
            System.out.println("Eligible");
        }
    }

    // example 2
    static void divide() throws DivideException {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        if(b == 0) {
            throw new DivideException("We can not divide any number by 0." );
        }

        System.out.println("answer is : " + a / b);
    }

    public static void main(String[] args) {
        try {
            ageChecker( 18 );
        }catch (Exception e) {
            System.out.println(e);
        }

        try {
         divide();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class DivideException extends Exception {
    public DivideException(String message) {
        super(message);
    }
}

