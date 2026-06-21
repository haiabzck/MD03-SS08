package Exercise10;

public class Exercise10 {
    public static void main(String[] args) {
        PaymentMethod credit = new CreditCard(1000);
        PaymentMethod debit = new DebitCard(1000);
        PaymentMethod cash = new Cash(1000);

        System.out.println("--- Giao dịch Credit Card ---");
        System.out.println("Phí: $" + credit.calculateFee());
        System.out.println("Tổng tiền: $" + credit.processPayment());
        System.out.println("Tổng tiền (VND): " + credit.processPayment("VND"));

        System.out.println("\n--- Giao dịch Debit Card ---");
        System.out.println("Phí: $" + debit.calculateFee());
        System.out.println("Tổng tiền: $" + debit.processPayment());
        System.out.println("Tổng tiền (EUR): " + debit.processPayment("EUR"));

        System.out.println("\n--- Giao dịch Cash ---");
        System.out.println("Phí: $" + cash.calculateFee());
        System.out.println("Tổng tiền: $" + cash.processPayment());
        System.out.println("Tổng tiền (JPY): " + cash.processPayment("JPY"));
    }
}
