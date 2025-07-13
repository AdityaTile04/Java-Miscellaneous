package ExceptionHandling;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        try {
            System.out.println("Enter Name: ");
            String name = sc.nextLine();

            System.out.println("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter email: ");
            String email = sc.nextLine();

            Student s = new Student(name, age, email);
            s.printDetails();

        } catch (InValidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}

class Student {
    String name;
    int age;
    String email;

    public Student(String name, int age, String email) throws InValidAgeException {
        if(age < 18) {
            throw new InValidAgeException( "Age must be 18 or above" );
        }

        this.name = name;
        this.age = age;
        this.email = email;

    }
    public void printDetails() {
        System.out.println("---Student registered successfully---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}

class InValidAgeException extends Exception {
    public InValidAgeException(String message) {
        super(message);
    }
}
