import java.util.Scanner;

class Employee {
    String fname;
    String lname;
    double Sal;
    Scanner S1 = new Scanner(System.in);

    Employee(String fs, String ls, double sl) {
        fname = fs;
        lname = ls;
        if (sl < 0) {
            Sal = 0.0;
        } else {
            Sal = sl + (sl * 10 / 100);
        }
    }

    void getfs() {
        System.out.print("Enter first name: ");
        fname = S1.nextLine();
    }

    void getls() {
        System.out.print("Enter last name: ");
        lname = S1.nextLine();
    }

    void getsal() {
        System.out.print("Enter salary: ");
        Sal = S1.nextDouble();
        S1.nextLine(); // Consume newline
        if (Sal < 0) {
            Sal = 0.0;
        } else {
            Sal = Sal + (Sal * 10 / 100);
        }
    }

    void putfs() {
        System.out.println("First name: " + fname);
    }

    void putls() {
        System.out.println("Last name: " + lname);
    }

    void putsal() {
        System.out.println("Salary after 10% increment: " + Sal);
    }
}

public class PRACT13 {
    public static void main(String[] args) {
        Employee E1 = new Employee("", "", 0);
        Employee E2 = new Employee("", "", 0);

        System.out.println("Enter details for Employee 1:");
        E1.getfs();
        E1.getls();
        E1.getsal();
        
        System.out.println("\nEnter details for Employee 2:");
        E2.getfs();
        E2.getls();
        E2.getsal();
        
        System.out.println("\nDetails of Employee 1:");
        E1.putfs();
        E1.putls();
        E1.putsal();
        
        System.out.println("\nDetails of Employee 2:");
        E2.putfs();
        E2.putls();
        E2.putsal();
    }
}
