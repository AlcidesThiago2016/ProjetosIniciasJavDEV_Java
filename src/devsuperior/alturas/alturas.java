package devsuperior.alturas;

import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int n, nMinors = 0;
        double heigthTotal= 0, heigthAvarege, perctMinors;

        System.out.print("Quantos pessoas serao digitadas? ");
        n = sc.nextInt();
        String[] names = new String[n];
        int[] ages = new int[n];
        double[] heights = new double[n];

        for(int i=0; i < n ; i++) {
            sc.nextLine();
            System.out.printf("Dados da %dª pessoa:\n", i + 1);
            System.out.print("Nome: ");
            names[i] = sc.nextLine();
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
            System.out.print("Altura: ");
            heights[i] = sc.nextDouble();

            heigthTotal += heights[i];

            
            if (ages[i] < 16){
                nMinors++;
            }
        }

        perctMinors = ((double)nMinors / n) * 100.0;
        heigthAvarege = heigthTotal / n;

        System.out.printf("\nAltura Média = %.2f\n", heigthAvarege);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", perctMinors);

        for (int i=0; i < n ; i++){
            if (ages[i] < 16){
                System.out.printf("%s\n", names[i]);
            }
        }


        sc.close();
    }
}
