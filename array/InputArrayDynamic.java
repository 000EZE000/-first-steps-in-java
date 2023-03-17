package array;
import java.util.Scanner;

class InputArrayDynamic{
    public static void main(String args[]){
        try(Scanner in = new Scanner(System.in)){
            int acount = 1;
            System.out.println("How many rows do you many?");
            int rows = in.nextInt();
            System.out.println("how many columns do you many");
            int[][] arrayDynamic = new int[rows][in.nextInt()];
            for(int i = 0; i < arrayDynamic.length;i++ ){
                for(int o = 0 ; o < arrayDynamic[i].length;o++){
                    arrayDynamic[i][o]= acount;
                    System.out.print("["+arrayDynamic[i][o]+"]");
                    acount++;
                }
                System.out.println("");
            } 
        }
    }
}