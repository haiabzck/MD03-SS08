package Exercise2;

public class Car extends Vehicle{
    public Car(String name, int speed) {
        super(name, speed);
    }
    @Override
    public void displayInfo() {
        System.out.print("Car name: " + getName());
        System.out.println(", Speed: " + getSpeed() + " km/h");
    }
}
