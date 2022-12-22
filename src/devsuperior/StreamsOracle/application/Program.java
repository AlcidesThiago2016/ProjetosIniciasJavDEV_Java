package devsuperior.StreamsOracle.application;

import devsuperior.StreamsOracle.entities.Pessoa;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        //Implementando um Stream com operações intermediárias utilizando o metodo filter.
        List<Pessoa> pessoas = new Pessoa().populacePerson();
        Stream<Pessoa> stream = pessoas.stream().filter(pessoa -> pessoa.getNationality().equals("Brasil"));
        System.out.println(Arrays.toString(stream.toArray()));
    }
}
