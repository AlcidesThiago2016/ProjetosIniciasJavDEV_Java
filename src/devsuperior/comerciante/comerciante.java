package devsuperior.comerciante;

import java.util.Locale;
import java.util.Scanner;

public class comerciante {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        int n, below,inBetween, above;//ABAIXO, ENTRE E ACIMA
        double totalPurchase, totalSale, totalProfit;

        System.out.print("Serao digitados dados de quantos produtos? ");
        n = sc.nextInt();

        String[] product = new String[n];
        double[] priceBuy = new double[n]; //PRECO DE COMPRA
        double[] salePrice = new double[n];//PRECO DE VENDA
        double[] profitPercentage = new double[n];//PERCENTAGEM LUCROS


        for (int i = 0; i < n; i++) {
            System.out.printf("Produto %d\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            product[i] = sc.nextLine();
            System.out.print("Preco de compra : ");
            priceBuy[i] = sc.nextDouble();
            System.out.print("Preco de venda : ");
            salePrice[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            profitPercentage[i] = (salePrice[i] - priceBuy[i]) / priceBuy[i] * 100.0;
        }

        below = 0;
        inBetween = 0;
        above = 0;

        for (int i = 0; i < n; i++) {
            if (profitPercentage[i] < 10.0){
                below++;
            } else if (profitPercentage[i] < 20.0){
                inBetween++;
            }else {
                above++;
            }
        }

        totalPurchase = 0;
        totalSale = 0;

        for (int i = 0; i < n; i++) {
            totalPurchase += priceBuy[i];
            totalSale += salePrice[i];
        }

        totalProfit = totalSale - totalPurchase;

        System.out.println();
        System.out.println("RELATORIO:");
        System.out.printf("Lucro abaixo de 10%%: %d\n",below);
        System.out.printf("Lucro entre 10%% e 20%%: %d\n",inBetween);
        System.out.printf("Lucro acima de 20%%: %d\n",above);
        System.out.printf("Valor total da compra: %.2f\n", totalPurchase);
        System.out.printf("Valor total da venda: %.2f\n", totalSale);
        System.out.printf("Lucro total: %.2f\n", totalProfit);

        sc.close();

    }
}
