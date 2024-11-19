package exceptionexamples;

public class ThrowExample {
    //made the sample method static so it can be accessed in main method
    public static void sample(){

        int a = 10;
        if (a==10){
            throw new RuntimeException();
        }
        System.out.println("Value of a: "+ a);
    }
    public static void main(String[] args) {
    try {
        //called the sample method
        //classname.methodname
        ThrowExample.sample();
    }catch (Exception e){
        System.out.println("Error occurred: " + e.getMessage());
    }
    }


}
