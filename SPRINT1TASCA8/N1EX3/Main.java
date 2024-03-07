package INTELIJ.SPRINT1TASCA8.N1EX3;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        ArrayList<String> meses = new ArrayList<>();
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");

        meses.forEach(s1-> System.out.println(s1));
    }
}
