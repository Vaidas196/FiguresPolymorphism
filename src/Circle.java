public class Circle implements Figures{
    final private double PI = Math.PI;
    private double r;
    private final String name;

    public Circle(double r) {
        this.name = "Circle";
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
    return 2 * PI * r;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(r,2);
    }

    @Override
    public String getName() {
        return name;
    }
}
