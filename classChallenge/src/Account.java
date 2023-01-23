public class Account {

    public Account(String accountNumber, double balance, String name, String email, String phone){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        phoneNumber = phone;
    }
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public void withdraw(double amount) {

        if (balance - amount < 0) {
            System.out.println("You can't withdraw " + amount + ", you only have " + balance + " on your account");
            return;
        }
        balance -= amount;
        System.out.println("After withdrawing " + amount + ", your new balance is " + balance);
        return;
    }

    public void getInformations(){
        System.out.println("accountNumber: " + accountNumber);
        System.out.println("name: " + name);
        System.out.println("email: " + email);
        System.out.println("phoneNumber: " + phoneNumber);
        System.out.println("Balance: " + balance);

    }
    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("your new balance is " + balance);
        return;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        System.out.println("Balance: " + balance);
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
