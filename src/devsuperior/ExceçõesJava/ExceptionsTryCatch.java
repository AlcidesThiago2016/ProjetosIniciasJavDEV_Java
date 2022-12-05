package devsuperior.ExceçõesJava;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExceptionsTryCatch {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
        }
        catch (InputMismatchException e){
            System.out.println("Input error!");
        }
        System.out.println("Enf of program!");
        sc.close();
    }
}
