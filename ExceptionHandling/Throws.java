package ExceptionHandling;

public class Throws {
    // example 1
    static int getNumber(int a[]) throws ArrayIndexOutOfBoundsException {
       return a[8];
    }

    // example 2
    static void ageCheck(int age) throws ArithmeticException {
        if(age < 18) {
            System.out.println("Not eligible to vote!");
        } else {
            System.out.println("Eligible to vote!");
        }
    }

    // example 3
    static int divideByNumber(int a, int b) throws ArithmeticException {
        if(b == 0) {
            System.out.println("We can not divide any number by 0");
        }
       try {
           return a / b;
       } catch (ArithmeticException e) {
           System.out.println("We can not divide any number by 0");
           return -1;
       }
    }

    public static void main(String[] args) {
        int a[] = new int[5];

        try {
        getNumber( a );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Try to access out bound element" + e);
        }
        System.out.println("Hello from end");

        ageCheck(14);
        System.out.println(divideByNumber( 10, 2 ));

    }
}
