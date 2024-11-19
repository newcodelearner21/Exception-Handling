package exceptionexamples;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try{
            String msg1 = "Hello RaceCarGuy";
            String msg2 = null;
            System.out.println("length of msg1: " + msg1.length() );
            System.out.println("length of msg2: " + msg2.length() );
        }catch (NullPointerException e2){
            System.out.println("Error occurred: " + e2.getMessage());
        }
    }
}
