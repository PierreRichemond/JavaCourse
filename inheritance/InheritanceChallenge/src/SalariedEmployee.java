public class SalariedEmployee extends Employee{
    private double annualSalary;
    protected boolean isRetired;



    public SalariedEmployee(double annualSalary, String name, String birthDate, String hireDate) {
        super(hireDate, name, birthDate);
        this.annualSalary = annualSalary;
    }

    public double collectPay(){
        double pay = annualSalary / 20;
        return (isRetired) ? 0.9 * pay: pay;
    }


    public void retire(){
        this.terminate("2023");
        this.isRetired = true;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
