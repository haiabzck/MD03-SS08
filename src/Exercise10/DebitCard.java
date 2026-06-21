package Exercise10;

public class DebitCard extends PaymentMethod{
    public DebitCard(double amount) {
        super(amount);
    }
    @Override
    public double calculateFee(){
        return getAmount() * 0.01;
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
