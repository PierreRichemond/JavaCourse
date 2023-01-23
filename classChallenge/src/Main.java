public class Main {
    public static void main(String[] args) {
        Account account = new Account("12345", 100, "Bob", "bob@gmail.com", "020202020202");

        account.getInformations();
        account.deposit(200);
        account.withdraw(150);
        account.getBalance();
        account.withdraw(150);
    }
}