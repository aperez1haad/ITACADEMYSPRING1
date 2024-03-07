package INTELIJ.SPRINT1TASCA5.N1EX3;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
public class Directorio {
    public static void listarDirectorio (String rutaDirectorio, FileWriter writer){
        try {
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
                writer.write(tipo + " " + nombre + " " + ultimaModif+"\n");

                if (archivo.isDirectory()) {
                    listarDirectorio(archivo.getAbsolutePath(),writer); // aqui le digo que haga lo mismo con las subcarpetas, getAbsolutepath devuelve la ruta de la subcarpeta para que se ejecute el método
                }
            }
        }catch(IOException e){
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    public static void generarArchivodeCarpetasySubcarpetas(){
        //creo el filewriter fuera del otro método para que no se cree 1000 veces (cada vez que hay una subcarpeta (una llamada recursiva) se crearia un filewriter;
        //así, lo paso por parametro y me printa en el archivo todas las carpetas sin sobreescribirse cada vez que se ejectua el metodo
        try(FileWriter writer = new FileWriter("ListadoCarpetasySubcarpetas.txt")){
            listarDirectorio("C:\\Users\\formacio\\Desktop\\ALEX PEREZ",writer);
        }catch (IOException e){
            System.err.println("Error al abrir el archivo"+e.getMessage());
        }
    }
    public static void main (String[] args){
        generarArchivodeCarpetasySubcarpetas();

    }
}