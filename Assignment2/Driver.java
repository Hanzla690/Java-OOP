package Assignment2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        

        Department dep1 = new Department("CS", new Employee("CNG", "HOD"), 15);
        

        while(choice != -1){
            System.out.printf("%nChoose desired option from the following menu%n1. Display Labs Information%n2. Create a Lab%n3. Destroy a lab%n-1. Close Menu%n");
            choice = scan.nextInt();
            if(choice == 1){
                dep1.displayLabInfo();
            }
            else if(choice == 2){
                LabCreation(dep1);
            }
            else if(choice == 3){
                System.out.println("Lab Destroyed!");
            }
        }
    }

    public static void LabCreation(Department dep){
        String labname ="";
        int noOfComputers = 0;
        String empname ="";
        Scanner scanString = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        System.out.print("Enter name of the lab you want: ");
        labname = scanString.nextLine();
        System.out.print("Enter the amount of Computers you want: ");
        noOfComputers = scanInt.nextInt();
        System.out.print("Enter the name of the Lab Attendant: ");
        empname = scanString.nextLine();

        dep.createLab(labname, noOfComputers, empname, "Lab Attendant");
    }
}
