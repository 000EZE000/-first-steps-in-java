package average;
import java.io.IOException;

import input.Input;
public class AverageOThree {
    public static void main(String args[]) throws IOException{
        System.out.println("This program average of three numbers");
        int summation = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Select the number " +( i +1 ));
            summation =  summation + Input.main();
        }
        String result = String.format("%.2f", (Double.valueOf(summation) / 3));
        System.out.println("the average of the numbers entered was " + result );
    }

}
