package array;
import java.io.IOException;
import input.Input;

 class InputArray {
 public static void main(String args[]) throws IOException  {
    String arrayInput="";
    System.out.println("Enter the length of array ");
    int lengthArray = Input.main();
    if(lengthArray > 10 || lengthArray < 1){
        System.out.println("Number is invalid");
    }else{
        int[] listNumbers = new int[lengthArray];
        for(int i =0; i< listNumbers.length; i++){
            System.out.println("Enter the number " + ( i + 1));
            listNumbers[i] = Input.main();
            arrayInput = arrayInput + " " + "[" + listNumbers[i] + "]";
            }
        System.out.println(arrayInput);
        }

 }   

}
