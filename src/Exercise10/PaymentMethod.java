package Exercise10;

abstract class PaymentMethod {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    abstract double processPayment();
    abstract double calculateFee();
    abstract String processPayment(String currency);
}
