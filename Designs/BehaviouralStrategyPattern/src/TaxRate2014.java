public class TaxRate2014 implements TaxRate {
    @Override
    public double tax(double salary) {
        double salTax = 0.0;
        if(salary > 20000) {
            salTax = salary/20f;
        }
        return salTax;
    }
}
