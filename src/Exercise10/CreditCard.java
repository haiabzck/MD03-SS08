package Exercise10;

public class CreditCard extends PaymentMethod{
    public CreditCard(double amount) {
        super(amount);
    }
    @Override
    public double calculateFee(){
        return getAmount() * 0.02;
    }
    @Override
    public double processPayment(){
        return getAmount() + calculateFee();
    }
    @Override
    public String processPayment(String currency){
        return "Số tiền cần thanh toán là : "+processPayment()+" "+currency;
    }
}
