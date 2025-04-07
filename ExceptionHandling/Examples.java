package ExceptionHandling;

public class Examples {
   public static void main(String args[]) {
       int arr[] = new int[5];
       System.out.println("Hello");
       try  {
           System.out.println(arr[7]);
       } catch(ArrayIndexOutOfBoundsException e) {
           System.out.println("Tried to access the out of bound element");
           System.out.println(e.getMessage());
       }
       System.out.println("Aditya");

       int num = divide(2,0 );

       System.out.println(num);

       System.out.println("This is an End!");

   }


   public static int divide(int a, int b) {
       try {
           return a / b;
       } catch (Exception e) {
           System.out.println("We can not divide 0 by any number.");
           return -1;
       }
   }


}
