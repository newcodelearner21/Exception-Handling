package exceptionexamples;

public class GenericCatchExceptionExample {
    public static void main(String[] args) {
        /*Generic Catch Exception:
            One catch block for any exception that occurs in the code
            no need for multiple catch block
        * */
        try{
            int[] arr = {1,2,3,4};
            System.out.println("Array element at 4th index is: " + arr[4]);
            int a = 20/2;
            System.out.println("value of a: " + a);
        } catch (Exception e) {
            System.out.println("Error occurred: "+ e.getMessage());
        }
    }
}
