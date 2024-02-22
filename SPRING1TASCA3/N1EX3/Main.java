package INTELIJ.SPRING1TASCA3.N1EX3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static String NombreNuevoUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        return scanner.nextLine();
    }
    public static Usuario JugaraCapitales(HashMap PaisesCapitales){
        Scanner scanner = new Scanner(System.in);
        String nombre =  NombreNuevoUsuario();
        int puntosUsuario = 0;
        HashSet<String> paisesPreguntados = new HashSet<>();
        String paisAleatorio;
        int indiceAleatorio;
        String capitalCorrecta;

        for (int i = 1; i <= 10; i++) {
            do {
                Set<String> paisesDisponibles = PaisesCapitales.keySet();
                indiceAleatorio = (int) (Math.random() * paisesDisponibles.size());
                paisAleatorio = (String) (paisesDisponibles).toArray()[indiceAleatorio];
            } while (paisesPreguntados.contains(paisAleatorio));

            paisesPreguntados.add(paisAleatorio);

            System.out.println("¿Cuál es la capital de " + paisAleatorio + "?");
            String respuestaUsuario = scanner.nextLine().replace(" ", "_");

            capitalCorrecta = (String) PaisesCapitales.get(paisAleatorio);

            if (respuestaUsuario.equalsIgnoreCase(capitalCorrecta)) {
                System.out.println("¡Correcto! Ganaste un punto.");
                puntosUsuario++;
                System.out.println("Tu puntuación actual es: " + puntosUsuario);
            } else {
                System.out.println("Lo siento, la respuesta correcta es " + capitalCorrecta + ".");
            }
        }

        return new Usuario(nombre, puntosUsuario);
    }
    public static ArrayList<Usuario> JugadoresNombreyNota() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> NotasJuegoCapitales = new ArrayList<>();

        Boolean Jugadores = true;
        do{
            NotasJuegoCapitales.add(JugaraCapitales(PaisesCapitales()));
            System.out.println("Hay más jugadores? (Sí/No)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("No")){
                Jugadores = false;
            }
        } while(Jugadores);

        return NotasJuegoCapitales;
    }
    public static HashMap PaisesCapitales() throws FileNotFoundException {
        HashMap<String, String> HashMappaisescapitales = new HashMap<>();

        Scanner sc = new Scanner(new File("C:\\Users\\formacio\\Downloads\\countries.txt"));
        while (sc.hasNextLine()) {
            String LineaPaisCapital = sc.nextLine();
            if (LineaPaisCapital.isEmpty() == false || LineaPaisCapital.isBlank() == false) {
                String[] partes = LineaPaisCapital.split(" ");
                HashMappaisescapitales.put(partes[0], partes[1]);
            }
        }
        sc.close();

        // Imprimo el HashMap
        /*for (String pais : HashMappaisescapitales.keySet()) {
            System.out.println(pais + " - " + HashMappaisescapitales.get(pais));
        }*/
        return HashMappaisescapitales;
    }
    public static void guardarEnArchivo(ArrayList<Usuario> listaUsuarios, String nombreArchivo) {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            for (Usuario usuario : listaUsuarios) {
                writer.write(usuario.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    public static void main (String[]args) throws FileNotFoundException {
        ArrayList<Usuario> jugadores = JugadoresNombreyNota();
        for (int i = 0; i<jugadores.size();i++){
            System.out.println(jugadores.get(i).toString());
        }
        guardarEnArchivo(jugadores, "usuarios.txt");

    }

}