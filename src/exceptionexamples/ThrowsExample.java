package exceptionexamples;

public class ThrowsExample {
    public static void sample() throws IllegalAccessException, NoSuchMethodException {
        System.out.println("Inside sample method.");
        int a = 10;
        // you dont need to add unchecked exception but  if you add it to the method system does allow it
        if (a == 10) {
            throw new RuntimeException("a values is 5 it is unchecked exception");
        }
        // All checked exceptions gives a compile time error so needs to be added to the method
        if (a == 5) {
            throw new IllegalAccessException("a values is 10 it is a checked exception");
        }
        if (a == 15) {
            throw new ArithmeticException("a value is 15 it is unchecked exception.");
        }
        //if  another checked exception is given you need to add it to the method
        if (a == 20) {
            throw new NoSuchMethodException("a value is 20 it is a checked exception");
        }
    }

    public static void main(String[] args) {

        try {
            ThrowsExample.sample();


        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}