package exceptionexamples;

    public class TryAndCatchExample {
        public static void main(String[] args) {
            try{
                //code to monitor
                int a= 10;
                int b = a/0;

                System.out.println("value of a: "+a);
                System.out.println("value of b: "+b);
            }catch (ArithmeticException e){
                //code to handle exception
                System.out.println("Error occurred: "+e.getMessage());
            }
        }
    }

