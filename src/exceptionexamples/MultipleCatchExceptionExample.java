package exceptionexamples;

public class MultipleCatchExceptionExample {
    public static void main(String[] args) {
        try{
            int[] arr = {1,2,3,4};
            System.out.println("Array element at 3rd index is: " + arr[3]);
            int a = 20/0;
            System.out.println("value of a: " + a);
            }
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("Exception occurred:" + e2.getMessage());
            }
        catch (ArithmeticException e1){
            System.out.println("Exception occurred:" + e1.getMessage());
            }
        System.out.println("After multiple catch blocks");
    }
}
