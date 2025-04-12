package ExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried to access the out of bound element");
        } finally {
            System.out.println("i will run always");
        }

        try {
        int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("We can not divide any number by 0");
        } finally {
            System.out.println("i'm always run");
        }
    }
}
