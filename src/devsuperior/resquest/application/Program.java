package devsuperior.resquest.application;

import devsuperior.resquest.entities.Client;
import devsuperior.resquest.entities.OrderItem;
import devsuperior.resquest.entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);



        sc.close();

    }
}
