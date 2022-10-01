package Rectangle.application;

import Rectangle.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Entre com a largura e altura do retângulo:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", rectangle.area());
        System.out.printf("PERIMETRO = %.2f\n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", rectangle.diagonal());
        sc.close();
    }
}
