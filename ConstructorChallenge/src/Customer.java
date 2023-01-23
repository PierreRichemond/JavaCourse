public class Customer {

    private String customerName;
    private int creditLimit;
    private String customerEmail;

    public Customer(){
        this("defaultName", "defaultEmail.com");
    }
    public Customer(String name, String email) {
        this(name, 4000, email);
    }

    public Customer(String name, int creditLimit, String email) {
        this.customerName = name;
        this.creditLimit = creditLimit;
        this.customerEmail = email;
    }

    public String getcustomerName() {
        System.out.println(this.customerName);
        return customerName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getcustomerEmail() {
        return customerEmail;
    }
}
