public class Main {
    public static void main(String[] args) {
        Customer cus1 = new Customer();
        Customer cus2 = new Customer("bob", "bob.com");
        Customer cus3 = new Customer("Marty", 1000, "marty.com");

        cus1.getcustomerName();
        cus2.getcustomerName();
        cus3.getcustomerName();
    }
}