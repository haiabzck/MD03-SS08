package Exercise3;

public class Square implements Colorable {
    private final double side;
    private String color;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

}
