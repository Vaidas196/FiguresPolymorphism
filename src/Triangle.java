import javax.naming.Name;

public class Triangle implements Figures {
private double a;
private double b;
private double c;
private final String name;
    public Triangle(double a, double b, double c) {
        this.name = "Triangle";
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        //tyngiu rasyt formule
        return  a*b;
    }

    @Override
    public String getName() {
        return name;
    }
}
