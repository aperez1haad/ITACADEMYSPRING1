package INTELIJ.SPRING1TASCA8.N1EX7;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main (String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan354");
        nombres.add("5464Marcos");
        nombres.add("Alex567");
        nombres.add("h653uhPolhnu687");
        nombres.add("Annateyj566");
        nombres.add("Fanny54hn765");
        nombres.add("A4y4ntoniog5634");

        nombres.sort(Comparator.comparingLong(String::length).reversed());
        nombres.forEach(System.out::println);

        //otra forma de hacer sin el comparator
        nombres.sort((s1,s2)-> Integer.compare(s2.length(),s1.length()));
        nombres.forEach(System.out::println);

    }
}
