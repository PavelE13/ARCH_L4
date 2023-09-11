public class Main {
    public static void main(String[] args) {
        GeometryFigure figure = new GeometryFigure();
        Circle circle1 = new Circle(10);
        Square square1 = new Square(8);
        Triangle triangle1 = new Triangle(10, 8, 7, 6, 5);

        figure.add(circle1);
        figure.add(square1);
        figure.add(triangle1);

        figure.getInfo(0);
        figure.getInfo(1);
        figure.getInfo(2);

        System.out.println(figure.count());
        figure.remove(0);
        System.out.println(figure.count());

        System.out.println(figure.count());
    }
}