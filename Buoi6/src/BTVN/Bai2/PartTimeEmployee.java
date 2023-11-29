package BTVN.Bai2;

public class PartTimeEmployee extends Employee{
    private final int workingHour;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHour) {
        super(name, paymentPerHour);
        this.workingHour = workingHour;
    }
    public int calculateSalary(){
        return workingHour * getPaymentPerHour();
    }

    public int getWorkingHours() {
        return workingHour;
    }
}
