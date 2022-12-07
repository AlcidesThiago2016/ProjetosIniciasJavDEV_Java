package devsuperior.Generics3.application;

import devsuperior.Generics3.entities.Circle;
import devsuperior.Generics3.entities.Rectangle;
import devsuperior.Generics3.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0,2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(2.0));
        myCircle.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircle));
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
