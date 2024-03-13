package INTELIJ.SPRINT1TASCA5.N1EX1;
import java.io.File;
import java.util.Arrays;
public class Directorio {
    public static void listarDirectorio(String rutaDirectorio) {
        File directorio = new File(rutaDirectorio);
        String[] contenido = directorio.list(); //Creo Strings con los que haya en el directorio.
        Arrays.sort(contenido); // Ordeno alfabitecamente la Array con el método sort
        for (String nombre : contenido) //declaro una vble string llamada nombre para iterar sobre los string "contenido" del directorio
        {
            System.out.println(nombre);
        }
    }
}
