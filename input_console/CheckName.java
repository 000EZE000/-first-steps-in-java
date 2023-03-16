import java.util.Scanner;

class CheckName{
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String NAME_SECRET = "CHACHO", nameInput;
            System.out.println("Enter the name");
            nameInput = in.nextLine();
            if(NAME_SECRET.equals(nameInput)) System.out.println("The name is correct"); 
                else System.out.println("The name is not correct");
              
            
        } 
    }
}
