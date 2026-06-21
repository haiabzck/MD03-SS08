package Exercise9;

public class ElectricCar extends Car implements Refuelable{
    public ElectricCar(String model, int year, double price) {
        super(model, year, price);
    }

    @Override
    String start(){
        return "Xe điện "+ getModel() + " (Năm SX: "+ getYear() + ", Giá: " + getPrice() + ") đã khởi động không tiếng ồn.";
    }
    @Override
    String stop(){
        return "Xe điện "+ getModel() + " (Năm SX: "+ getYear() + ", Giá: " + getPrice() + ") đã dừng và ngắt kết nối động cơ.";
    }
    @Override
    public void refuel(){
        System.out.println("Xe điện "+ getModel() + " (Năm SX: "+ getYear() + ", Giá: " + getPrice() + ") đang sạc điện…");
    }
}
