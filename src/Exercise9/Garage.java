package Exercise9;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Car> carList =new ArrayList<>();
    public void addCar(Car car){
        carList.add(car);
        System.out.println("-> Đã thêm xe "+ car.getModel() + "vào gara.");
    }

    public void startAll(){
        System.out.println("\nKhởi động tất cả xe trong gara .");
        for (Car car : carList){
            System.out.println(car.start());
        }
    }

    public void stopAll(){
        System.out.println("\nDừng tất cả xe trong gara .");
        for (Car car : carList){
            System.out.println(car.stop());
        }
    }

    public void refuelAll(){
        System.out.println("\nNạp nhiên liệu cho các xe ");
        for (Car car : carList){
            if(car instanceof Refuelable){
                ((Refuelable) car).refuel();
            }
        }
    }
}
