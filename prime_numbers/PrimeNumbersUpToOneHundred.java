package prime_numbers;

public class PrimeNumbersUpToOneHundred {
    public static void main(String args[]){
        PrimeNumber checkPrime = new PrimeNumber();
        for (int i = 1; i < 100; i++) {
            if(i % 50 == 0) System.out.println("");
           if(checkPrime.detecPrimeNumber(i)) System.out.print(" " + i + " ");
        }
    }
}   
