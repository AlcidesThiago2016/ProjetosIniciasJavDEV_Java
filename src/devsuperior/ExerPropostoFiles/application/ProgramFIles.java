package devsuperior.ExerPropostoFiles.application;

import devsuperior.ExerPropostoFiles.entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramFIles {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileS = sc.nextLine();

        File sourceFile = new File(sourceFileS);
        String sourceFolders = sourceFile.getParent();

        boolean sucess = new File(sourceFolders + "/out").mkdir();

        String targetFileS = sourceFolders + "/out/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileS))){

            String itemCsv = br.readLine();
            while (itemCsv != null){

                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price ,  quantity));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileS))){
                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println(targetFileS + " CREATED SUCCESS!");
            }
            catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }
        }
        catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
