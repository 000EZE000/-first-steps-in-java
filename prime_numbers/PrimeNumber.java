package prime_numbers;
import java.io.IOException;
import java.io.PrintStream;

import input.Input;
public class PrimeNumber {
    public static void main(String args[]) throws IOException{
        detecPrimeNumberInput();
    }
    public boolean detecPrimeNumber(int number){
            if(number < 10){
                switch(number){
                    case 2:
                        return true;
                    case 3:
                        return true;
                    case 5:
                        return true;
                    case 7:
                        return true;
                    default:
                    return false;
                }
            }
            int divider = (int) Math.sqrt(number);
            for (int i = 2; i < divider; i++) {
                if(number % i == 0) {
                    return false;
                }
            }
            return true;
        
    }

    public static void detecPrimeNumberInput() throws IOException{
        System.out.println("This program checkes if the entered number is prime");
        System.out.println("--------------------------------------------------------");
        System.out.println("Enter of Number");
        PrintStream  log = System.out;
        int inputOfUser = Input.main();
            if(inputOfUser < 10){
                switch(inputOfUser){
                    case 2:
                        log.println("is Prime");
                        return;
                    case 3:
                        log.println("is Prime");
                        return;
                    case 5:
                        log.println("is Prime");
                        return;
                    case 7:
                        log.println("is Prime");
                        return;
                    default:
                        log.println("is not Prime");
                        return;
                }
            }
            int divider = (int) Math.sqrt(inputOfUser);
            for (int i = 2; i < divider; i++) {
                if(inputOfUser % i == 0) {
                    log.println("is not Prime"+" the diviver is " + i);
                    return;
                }
            }
            log.println("is Prime");
        
    }
}
