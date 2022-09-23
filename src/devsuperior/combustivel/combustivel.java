package devsuperior.combustivel;

import java.util.Locale;
import java.util.Scanner;

public class combustivel {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int num, alcool = 0, gasolina = 0, diesel = 0;

        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        num = sc.nextInt();

        while ( num != 4){

            if ( num == 1){
                alcool++;
            } else if (num == 2) {
                gasolina++;
            } else if (num == 3) {
                diesel++;
            }

            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            num = sc.nextInt();

        }

        System.out.println("Muito Obrigado!");
        System.out.println("Alcool: "+ alcool);
        System.out.println("Gasolina: "+ gasolina);
        System.out.println("Diesel: "+ diesel);
    }
}
