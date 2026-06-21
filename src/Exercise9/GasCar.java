package Exercise9;

public class GasCar extends Car implements Refuelable{
    public GasCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    String start(){
        return "Xe chạy xăng "+ getModel() + " (Năm SX: "+ getYear() + ", Giá: " + getPrice() + ") đã khởi động với tiếng động cơ.";
    }
    @Override
    String stop(){
        return "Xe chạy xăng "+ getModel() + " (Năm SX: "+ getYear() + ", Giá: " + getPrice() + ") đã dừng và động cơ tắt.";
    }
    @Override
    public void refuel(){
        System.out.println("Xe chạy xăng "+ getModel() + " (Năm SX: "+ getYear() + ", Giá: " + getPrice() + ") đang được đổ xăng…");
    }

}
