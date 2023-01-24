public class Employee extends Worker{

    protected long employeeId;
    protected String hireDate;
    private static int employeeNo = 1;
    public Employee(String hireDate, String name, String birthDate) {
        super(name, birthDate);
        this.employeeId =  Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
