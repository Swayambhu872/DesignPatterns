public class Employee {
    protected String id;
    protected int salary;
    protected TaxRate taxRate;
    public Employee(String id, int salary) {
        this.id = id;
        this.salary = salary;

    }
    public void setTaxRate(TaxRate tx) {
        this.taxRate = tx;
    }
    public void printTax() {
        System.out.println(taxRate.tax(salary));
    }
}
