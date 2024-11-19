package exceptionexamples;

public class TryNestedExample {
    public static void main(String[] args) {
        //First Block
        try {
            int b = 10 / 2;
            System.out.println("value of b is: " + b);

            //Second Block
            try {
                int[] arr = {0, 1, 2, 3};
                System.out.println("Element at index 3 is: " + arr[3]);
                //Third Block
                try {
                    String a = null;
                    System.out.println("Length of a is: " + a.length());
                } catch (NullPointerException e) {
                    System.out.println("Error Occurred: " + e.getMessage());
                }
            }

                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error Occurred: " + e.getMessage());
                }
        } catch (ArithmeticException e) {
            System.out.println("Error Occured: " + e.getMessage());
        }

    }
}


