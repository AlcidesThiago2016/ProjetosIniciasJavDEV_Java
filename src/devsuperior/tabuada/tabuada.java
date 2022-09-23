package devsuperior.tabuada;

import java.util.Locale;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int calc, x , i;

        System.out.print("Deseja a tabuada para qual valor: ");
        x = sc.nextInt();

        for (i = 1; i < 11; i++){
            calc = x * i;
            System.out.println(x + " x " + i + " = "+ calc);
        }


    }
}
