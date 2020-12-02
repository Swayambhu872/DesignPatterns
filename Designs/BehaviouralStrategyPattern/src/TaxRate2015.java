public class TaxRate2015 implements TaxRate {
    @Override
    public double tax(double salary) {
        double salTax = 0.0;
        if(salary > 30000) {
            salTax = salary/20f;
        }
        return salTax;
    }
}
