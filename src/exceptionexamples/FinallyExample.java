package exceptionexamples;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int a = 10/10;
            System.out.println("a is no. " + a);
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
        finally {
            System.out.println("finally block executes anyway if exception occur or not");
        }
    }
}
