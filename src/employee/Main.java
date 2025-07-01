package employee;
import java.util.*;
public class Main {
    public static void main(String[] args){
        EmployeeDao empObj = new EmployeeImpl();
        System.out.println("Welcome to Employee Management System");
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        do{
            System.out.println("1. Add Employee\n" +
                    "2. Show All Employees\n" +
                    "3. Show Employee based on Id\n" +
                    "4. Update Employee\n" +
                    "5. Delete Employee\n" +
                    "6. Exit the Application\n");
            System.out.print("Enter your Choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    empObj.createEmployee();
                    break;
                case 2:
                    empObj.showAllEmployee();
                    break;
                case 3:
                    System.out.print("Enter Employee Id: ");
                    int id = sc.nextInt();
                    empObj.showEmployeeOnId(id);
                    break;
                case 4:
                    System.out.print("Enter Employee Id to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name to be Update: ");
                    String name = sc.nextLine();
                    empObj.updateEmployee(updateId, name);
                    break;
                case 5:
                    System.out.print("Enter Employee Id to delete:");
                    int deleteId = sc.nextInt();
                    empObj.deleteEmployee(deleteId);
                    break;
                case 6:
                    System.out.println("Exiting the Application...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Choice. Try Again!");
                    break;
            }
        }while(!exit);
        sc.close();
    }
}
