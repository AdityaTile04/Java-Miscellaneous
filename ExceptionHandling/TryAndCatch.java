package ExceptionHandling;

public class TryAndCatch {
    // Example 1
    public static void main(String args[]) {
        int[] numerator = {20, 40, 50, 30};
        int[] denominator = {2, 3, 0, 3};

        for(int i = 0; i < numerator.length; i++) {
            System.out.println(divide( numerator[i], denominator[i] ));
        }

        // Example 2
        int[] num = new int[5];

        try {
            System.out.println(num[5]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array of out bounds error");
        }
        System.out.println("Hello World");
    }

    public static int divide(int a, int b) {
       try {
            return a / b;
       } catch (Exception e) {
           System.out.println("Error while running code" + e);
           return 0;
       }
    }

}

