import java.util.Scanner;

public class EmployeeVacationDays{
  public static void main(String args[]){
    
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("requested employee name");
      String nameEmployee = input.nextLine().toLowerCase(); 	
      
      System.out.println("employee work area");
      String workAreaEmployee = input.nextLine().toLowerCase();
      
      System.out.println("employee seniority");
      
      int employeeSeniority = input.nextInt();
      
      
 System.out.println(workAreaEmployee == "costomer support");   

      if(workAreaEmployee == "costomer support"){
System.out.println(true);
        if(employeeSeniority <= 1){
System.out.println(true);
          System.out.println("the employee " + nameEmployee + " is entitled to 6  days of vacation");
        }else if(employeeSeniority > 1 && employeeSeniority < 7){      
          System.out.println("the employee " + nameEmployee + " is entitled to 14  days of vacation");
        }else if(employeeSeniority > 7){
          System.out.println("the employee " + nameEmployee + " is entitled to 20  days of vacation");
        }
      }else if(workAreaEmployee == "logistics"){
       if(employeeSeniority <= 1){
         System.out.println("the employee " + nameEmployee + " is entitled to 6  days of vacation");
       }else if(employeeSeniority > 1 && employeeSeniority < 7){      
         System.out.println("the employee " + nameEmployee + " is entitled to 14  days of vacation");
       }else if(employeeSeniority > 7){
         System.out.println("the employee " + nameEmployee + " is entitled to 20  days of vacation");
        }
      }
      else if(workAreaEmployee == "management"){
       if(employeeSeniority <= 1){
         System.out.println("the employee " + nameEmployee + " is entitled to 10  days of vacation");
       }else if(employeeSeniority > 1 && employeeSeniority < 7){      
         System.out.println("the employee " + nameEmployee + " is entitled to 20  days of vacation");
       }else if(employeeSeniority > 7){
         System.out.println("the employee " + nameEmployee + " is entitled to 30  days of vacation");
      }
      }
    }
    
    System.out.println("Error in the entered parameters");
  }
}
