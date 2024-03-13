package INTELIJ.SPRINT1TASCA5.N1EX5;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException,ClassNotFoundException{
        Contacto alumno1 = new Contacto("Alex", 27); // creo objeto serializable
        alumno1.serializarDeserializar();
    }
}
