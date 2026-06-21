package Exercise2;

public class Bike extends Vehicle {
    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo() {
        System.out.print("Bike name: " + getName());
        System.out.println(", Speed: " + getSpeed() + " km/h");
    }
}
