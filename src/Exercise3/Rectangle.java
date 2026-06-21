package Exercise3;

public class Rectangle implements Colorable {
    private final double length;
    private final double width;
    private String color;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public String getColor() {
        return color;
    }
    public double getWidth() {
        return width;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

}
