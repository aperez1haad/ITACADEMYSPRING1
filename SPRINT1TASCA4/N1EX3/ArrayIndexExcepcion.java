package INTELIJ.SPRINT1TASCA4.N1EX3;
import java.util.ArrayList;

public class ArrayIndexExcepcion {
    public void ArrayIndexOutOfBounds(){
        ArrayList <Integer> ListaEjemplo = new ArrayList<>();
        ListaEjemplo.add(2);
        ListaEjemplo.add(5);
        ListaEjemplo.add(8);
        ListaEjemplo.get(7);
    }
}
