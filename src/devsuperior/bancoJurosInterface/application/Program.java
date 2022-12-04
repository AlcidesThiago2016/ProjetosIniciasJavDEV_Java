package devsuperior.bancoJurosInterface.application;

import devsuperior.bancoJurosInterface.entities.Contract;
import devsuperior.bancoJurosInterface.entities.Installment;
import devsuperior.bancoJurosInterface.services.ContractService;
import devsuperior.bancoJurosInterface.services.PayPayService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc =  new Scanner(System.in);

        DateTimeFormatter fmt =DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number,date, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService =new ContractService(new PayPayService());

        contractService.processContract(obj, n);

        System.out.println("Parcelas: ");
        for (Installment installment : obj.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();

    }
}
