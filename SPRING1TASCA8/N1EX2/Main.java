package INTELIJ.SPRING1TASCA8.N1EX2;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> PalabrasconO (ArrayList<String>nombres){
        ArrayList<String> resultado = new ArrayList<>();
        nombres.forEach(s1 -> {
            if(s1.contains("o")&&s1.length()>5){
                resultado.add(s1);
            }
        });
        return resultado;
    }
    public static void main (String[] args){
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Marcos");
        nombres.add("Alex");
        nombres.add("Pol");
        nombres.add("Anna");
        nombres.add("Fanny");
        nombres.add("Antonio");

        ArrayList<String>nombresconO = PalabrasconO(nombres);
        System.out.println("Palabras con 'O': "+nombresconO);
    }
}
