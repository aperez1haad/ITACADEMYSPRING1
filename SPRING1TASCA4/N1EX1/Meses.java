package INTELIJ.SPRING1TASCA4.N1EX1;
import java.util.ArrayList;

public class Meses {
    private ArrayList <String> meses;
    public Meses(){
        this.meses = new ArrayList<>();
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
    }
    public ArrayList<String> getMeses(){
        return meses;
    }
}
