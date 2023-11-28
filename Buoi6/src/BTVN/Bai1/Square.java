package BTVN.Bai1;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    public Square(String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        this.length = side;
        this.width = side;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public double getSide(double side) {
        return width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side='" + length + "'" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
