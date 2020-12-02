import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year");
        int fiscalYear = scan.nextInt();
        System.out.println("Enter the Employee id");
        String empid =scan.nextLine();
        scan.nextLine();
        System.out.println("Enter Employee salary");
        int salary = scan.nextInt();
        if(fiscalYear == 2104) {
            System.out.println(" inside if");
            Employee employee = new Employee(empid,salary);
            System.out.println(" Employee object created");
            TaxRate2014 tx =new TaxRate2014();
            System.out.println(" tax2014 object created");
            employee.setTaxRate(tx);
            System.out.println(" employee tax set");
            employee.printTax();
            System.out.println(" employee tax set");
        } else if(fiscalYear == 2105) {
            Employee employee = new Employee(empid,salary);
            TaxRate2015 tx =new TaxRate2015();
            employee.setTaxRate(tx);
            employee.printTax();
        }
    }
}
