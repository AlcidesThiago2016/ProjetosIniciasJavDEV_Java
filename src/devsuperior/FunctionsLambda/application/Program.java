package devsuperior.FunctionsLambda.application;

import devsuperior.FunctionsLambda.entities.Product;
import devsuperior.FunctionsLambda.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",900.00));
        list.add(new Product("Mouse",50.00));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("Hd Case",80.50));

        //Implement function class UpperCaseName
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        System.out.println("Impressão lista com nomes maiusculos utilizando a classe UpperCaseName");
        names.forEach(System.out::println);

        System.out.println("Impressão lista com nomes maiusculos utilizando a função staticUpperCaseName");
        List<String> names1 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        names1.forEach(System.out::println);

        System.out.println("Impressão lista com nomes maiusculos utilizando a função nonStaticUpperCaseName");
        List<String> names2 = list.stream().map(Product::noNStaticUpperCaseName).collect(Collectors.toList());
        names2.forEach(System.out::println);

        System.out.println("Impressão lista com nomes maiusculos utilizando a empressão lambda declarada");
        Function<Product, String> func = p -> p.getName().toUpperCase();
        List<String> names3 = list.stream().map(func).collect(Collectors.toList());
        names3.forEach(System.out::println);

        System.out.println("Impressão lista com nomes maiusculos utilizando a empressão lambda inline");
        List<String> names4 = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names4.forEach(System.out::println);
    }
}
