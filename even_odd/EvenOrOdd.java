package even_odd;
import java.io.IOException;

import input.Input;

public class EvenOrOdd  {
    public static void main(String args[]) throws IOException  {
        System.out.println("enter a Number");
        int inputNumber = Input.main();
        String result = inputNumber % 2 == 0 ? "Is Even":"Is Odd";    
        System.out.println(result); 
    }
}
