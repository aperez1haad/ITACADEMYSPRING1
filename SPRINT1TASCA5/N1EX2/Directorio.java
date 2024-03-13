package INTELIJ.SPRINT1TASCA5.N1EX2;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
public class Directorio {
    public static void listarDirectorio(String rutaDirectorio) {
        File directorio = new File(rutaDirectorio);
        String[] contenido = directorio.list(); //Creo Strings con los que haya en el directorio.
        Arrays.sort(contenido); // Ordeno alfabitecamente la Array con el método sort
        for (String nombre : contenido) //declaro una vble string llamada nombre para iterar sobre los string "contenido" del directorio
        {
            File archivo = new File(directorio, nombre); // Creo un file "archivo" por cada String del directorio
            String tipo = "";
            if (archivo.isDirectory()) {
                tipo = "D";
            } else {
                tipo = "F";
            }
            Date ultimaModif = new Date(archivo.lastModified());
            System.out.println(tipo + " " + nombre + " " + ultimaModif);

            if (archivo.isDirectory()) {
                listarDirectorio(archivo.getAbsolutePath()); // aqui le digo que haga lo mismo con las subcarpetas, getAbsolutepath devuelve la ruta de la subcarpeta para que se ejecute el método
            }
        }
    }
}
