package exceptionexamples;

public class ArrayOutOfBounceExceptionExample {
    public static void main(String[] args) {
        try{
            int[] arr ={1,2,3,4,5};

            System.out.println("length of the array:" + arr.length);
            System.out.println("Array element at 2nd index is:" + arr[2]);
            System.out.println("Array element at 5 index is:" + arr[5]);
        }catch(ArrayIndexOutOfBoundsException e3){
            System.out.println("Exception occurred: " + e3.getMessage());
        }


    }
}
