package ExceptionHandling;

public class Throw {

    static void ageChecker(int age) {
        if(age < 18){
            throw new ArithmeticException("Not eligible for vote");
        } else  {
            System.out.println("Eligible for vote");
        }
    }

    static int divideNumber(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("We can not divide any number by 0");
        }
        return a / b;
    }

    public static void main(String[] args) {
        ageChecker( 17 );
        System.out.println(divideNumber( 10, 2 ));
    }
}
