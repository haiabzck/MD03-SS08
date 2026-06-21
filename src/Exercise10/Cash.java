package Exercise10;

public class Cash extends PaymentMethod{
    public Cash(double amount) {
        super(amount);
    }
    @Override
    public double calculateFee(){
        return 0;
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
