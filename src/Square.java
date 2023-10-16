public class Square implements Figures {
    private double a;
    private double b;
    private final String name;

    public Square(double a, double b) {
        this.name = "Square";
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * a) + (2 * b);
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public String getName() {
        return name;
    }
}
