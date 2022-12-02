package devsuperior.rentCar.model.application;

import devsuperior.rentCar.model.entities.CarRental;
import devsuperior.rentCar.model.entities.Vehicle;
import devsuperior.rentCar.model.services.BrazilTaxService;
import devsuperior.rentCar.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("*************Locação de Veiculos RENT SUPER*************");
        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr =  new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println();
        System.out.printf("FATURA: ");
        System.out.println("Pagamento básico: R$" + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: R$" + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: R$" + String.format("%.2f", cr.getInvoice().getTotalPayment()));



        sc.close();

    }
}
