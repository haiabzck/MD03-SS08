package Exercise2;

abstract class Vehicle {
    private final String name;
    private final int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract void displayInfo();

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}
