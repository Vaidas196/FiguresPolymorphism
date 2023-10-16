import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figures Triangle = new Triangle(10, 2 ,5);
        Figures Square = new Square(2,4);
        Figures Circle = new Circle(12);

        List<Figures> figuresList = new ArrayList<>();
        figuresList.add(Triangle);
        figuresList.add(Square);
        figuresList.add(Circle);

        for (Figures figure: figuresList) {
            System.out.println(figure.getName()+  " perimeter is: " + figure.calculatePerimeter());
            System.out.println(figure.getName()+  " area is: " + figure.calculateArea());
            System.out.println();

        }

    }
}