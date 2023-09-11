public class Square implements IShape{
    private double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(side);
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
