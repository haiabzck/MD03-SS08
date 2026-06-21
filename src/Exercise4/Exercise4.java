package Exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        BankAccount accountA = new BankAccount("A001", "Nguyễn Thị A", "0123456789");
        BankAccount accountB = new BankAccount("A002", "Trần Văn B", "0987654321");

        accountA.deposit(1000);

        double transferAmount = 300;
        accountA.withdraw(transferAmount);
        accountB.deposit(transferAmount);

        accountA.displayBalance();
        accountB.displayBalance();
    }
}
