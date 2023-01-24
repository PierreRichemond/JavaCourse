public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String hireDate, String name, String birthDate, double hourlyPayRate) {
        super(hireDate, name, birthDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay(){
        return this.collectPay() * 2;
    }

    public double collectPay(){
        return hourlyPayRate * 160;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
