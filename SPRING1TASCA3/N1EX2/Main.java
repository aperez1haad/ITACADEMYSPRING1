package INTELIJ.SPRING1TASCA3.N1EX2;
import INTELIJ.SPRING1TASCA3.N1EX1.Month;

import java.util.ArrayList;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        int numero =20;
        for (int i =0; i<=10; i++){
            lista1.add(numero);
            numero+=1;
        }
        for(int i = 0; i<lista1.size();i++) {
            System.out.println(lista1.get(i));
        }
        ArrayList<Integer> lista2 = new ArrayList<>();
        // creo iterador integer y lo pongo en la última posición para que vaya yendo hacia atrás. si no pusiera lo del size empezaria en la posición 0
        ListIterator<Integer> iterador = lista1.listIterator(lista1.size());

        while (iterador.hasPrevious()) {
            // Inserta el elemento en la segunda lista
            int numerox = iterador.previous();
            lista2.add(numerox);
        }
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
    }
}
