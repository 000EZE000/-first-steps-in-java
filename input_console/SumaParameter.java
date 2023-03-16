import java.util.Scanner;

public class SumaParameter{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    String name = "";
    int numOne = 0 , numTwo = 0, result = 0;
    System.out.println("What is your name? ");
    name = in.nextLine();
    System.out.println("Give me the first value for your sum ");
    numOne = in.nextInt();
    System.out.println("Give me the second value for your sum ");
    numTwo = in.nextInt();
    result = numOne + numTwo;
    System.out.println(name + " your sum is " + result);
  }
}
