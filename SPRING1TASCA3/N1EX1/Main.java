package INTELIJ.SPRING1TASCA3.N1EX1;

import java.util.ArrayList;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Month Enero = new Month("Enero");
        Month Febrero = new Month("Febrero");
        Month Marzo = new Month("Marzo");
        Month Abril = new Month("Abril");
        Month Mayo = new Month("Mayo");
        Month Junio = new Month("Junio");
        Month Julio = new Month("Julio");

        Month Septiembre = new Month("Septiembre");
        Month Octubre = new Month("Octubre");
        Month Noviembre = new Month("Noviembre");
        Month Diciembre = new Month("Diciembre");

        ArrayList<Month> Calendar = new ArrayList<>();

        Calendar.add(Enero);
        Calendar.add(Febrero);
        Calendar.add(Marzo);
        Calendar.add(Abril);
        Calendar.add(Mayo);
        Calendar.add(Junio);
        Calendar.add(Julio);
        Calendar.add(Septiembre);
        Calendar.add(Octubre);
        Calendar.add(Noviembre);
        Calendar.add(Diciembre);


        Month Agosto = new Month("Agosto");
        Calendar.add(7, Agosto);


        for(int i = 0; i<Calendar.size();i++) {
            System.out.println(Calendar.get(i).getNom());
        }

        HashSet<Month> CalendarHashset = new HashSet<>(Calendar);

        CalendarHashset.add(Octubre);
        CalendarHashset.add(Noviembre);
        CalendarHashset.add(Diciembre);


        System.out.println("");
        System.out.println("HashSet: ");

        for( Month month : CalendarHashset) {
            System.out.println(month.getNom());
        }


    }
}
