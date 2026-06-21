package Exercise1;

public class Cat extends Animals {
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public String makeSound() {
        return "Meow Meow";
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Màu lông: " + furColor);
    }
}
