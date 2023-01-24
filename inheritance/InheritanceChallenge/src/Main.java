public class Main {
    public static void main(String[] args) {
        SalariedEmployee john = new SalariedEmployee(30000, "John", "24/11/1990", "14/12/2018");
        SalariedEmployee joe = new SalariedEmployee(30000, "Joe", "24/11/1890", "14/12/2018");


        System.out.println(john);
        System.out.println(joe);
        System.out.println("age = " + john.getAge());
        System.out.println("pay = " + john.collectPay());
        john.retire();
        System.out.println("retired = " + john.isRetired);

        System.out.println("pension = " + john.collectPay());

        System.out.println(john);


        HourlyEmployee bob = new HourlyEmployee("14/12/2010", "Bob", "24/11/1990", 13);
        System.out.println("Double pay = " + bob.getDoublePay());
        System.out.println(bob);
    }
}