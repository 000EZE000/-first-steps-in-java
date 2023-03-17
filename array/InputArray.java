package array;
import java.util.Scanner;

 class InputArray {
 public static void main(String args[]) {
    String arrayInput="";
    System.out.println("Enter the length of array ");
    try(Scanner in = new Scanner(System.in)){
        int lengthArray = in.nextInt();
        if(lengthArray > 10 || lengthArray < 1){
            System.out.println("Number is invalid");
        }else{
            int[] listNumbers = new int[lengthArray];
            for(int i =0; i< listNumbers.length; i++){
                System.out.println("Enter the number " + ( i + 1));
                listNumbers[i] = in.nextInt();
                arrayInput = arrayInput + " " + "[" + listNumbers[i] + "]";
            }
            System.out.println(arrayInput);
        }
    }    
 }   

}
