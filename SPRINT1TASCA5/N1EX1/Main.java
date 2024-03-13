package INTELIJ.SPRINT1TASCA5.N1EX1;
import java.util.Scanner;

public class Main {
    public static String pedirRuta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon la ruta del directorio: ");
        return  sc.nextLine();
    }

    public static void main (String[] args){
        Directorio.listarDirectorio(pedirRuta());
    }

}