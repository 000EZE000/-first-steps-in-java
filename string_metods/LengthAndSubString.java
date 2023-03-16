package string_metods;
import java.util.Scanner;

class LengthAndSubString {
    public static void main(String args[]) {
        System.out.println("Enter a word");
        try (Scanner in = new Scanner(System.in)) {
            String lengthWord = in.nextLine();
            System.out.println("the length of the word is " + lengthWord.length());
            System.out.println(" ");
            System.out.println("what part of the string do you want to get");
            System.out.println("What is the first value");
            int firstValue = in.nextInt();
            System.out.println("Whats is the second value");
            int secondValue = in.nextInt();
            String subValueString = lengthWord.substring(firstValue,secondValue);
            System.out.println("Your subString is " + subValueString);
        }; 
          
        

    }
}
