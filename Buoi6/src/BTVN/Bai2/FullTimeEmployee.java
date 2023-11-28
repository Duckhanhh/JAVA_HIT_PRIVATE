package BTVN.Bai2;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    public int calculateSalary(){
        return 8 * getPaymentPerHour();
    }
}
