package devsuperior.Stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Integer> list = Arrays.asList(3,4,5,10,7);

        //criação de stream atraves de uma coleção(map).
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        //criação de stream atraves do Stream.of
        Stream<String> st2 = Stream.of("Maria",  "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        //Gerando uma stream atraves de um função de geracao utilizando o limit e iterate
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        //Sequencia de Fibonacci utilizando stream
        Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L},p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(20).toArray()));
    }
}
