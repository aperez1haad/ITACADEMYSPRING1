package INTELIJ.SPRINT1TASCA5.N1EX4;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class Directorio {
    public static void listarDirectorio (String rutaDirectorio, FileWriter writer) throws IOException {
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

                if(nombre.toLowerCase().endsWith(".txt")){
                    System.out.println("Leyendo el archivo "+archivo.getAbsolutePath()+" :");
                    try (BufferedReader br = new BufferedReader(new FileReader(archivo.getAbsolutePath()))) {
                        String linea;
                        while ((linea = br.readLine()) != null) {
                            System.out.println(linea);
                            writer.write(linea);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (archivo.isDirectory()) {
                    listarDirectorio(archivo.getAbsolutePath(),writer); // aqui le digo que haga lo mismo con las subcarpetas, getAbsolutepath devuelve la ruta de la subcarpeta para que se ejecute el método
                }
            }
        }
    public static void generarArchivodeCarpetasySubcarpetas(String RutaDirectorio){
        try(FileWriter writer = new FileWriter("ListadoCarpetasySubcarpetas.txt")){
            listarDirectorio(RutaDirectorio,writer);
        }catch (IOException e){
            System.err.println("Error al abrir el archivo"+e.getMessage());
        }
    }
}