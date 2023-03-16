import java.util.Scanner;

class Login{
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String USER_SECRET = "eze12", 
            PASSWORD_SECRET = "12345",
            inputUser,
            inputPassword;
            System.out.println("Enter the Username");
            inputUser = in.nextLine();
            System.out.println("Enter the password");
            inputPassword = in.nextLine();
            if(USER_SECRET.equals(inputUser) && PASSWORD_SECRET.equals(inputPassword)) System.out.println("The data is correct"); 
                else System.out.println("The username or password is incorrect");
              
            
        } 
    }
}
