package INTELIJ.SPRING1TASCA3.N1EX3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static String obtenerNombreUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        return scanner.nextLine();
    }

    public static Usuario jugarCapitales(HashMap<String, String> paisesCapitales) {
        Scanner scanner = new Scanner(System.in);
        String nombre = obtenerNombreUsuario();
        int puntosUsuario = 0;
        HashSet<String> paisesPreguntados = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            String paisAleatorio = obtenerPaisAleatorio(paisesCapitales.keySet(), paisesPreguntados);
            paisesPreguntados.add(paisAleatorio);

            System.out.println("¿Cuál es la capital de " + paisAleatorio + "?");
            String respuestaUsuario = scanner.nextLine().replace(" ", "_");

            String capitalCorrecta = paisesCapitales.get(paisAleatorio);

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

    public static String obtenerPaisAleatorio(Set<String> paisesDisponibles, HashSet<String> paisesPreguntados) {
        Random random = new Random();
        String paisAleatorio;
        do {
            int indiceAleatorio = random.nextInt(paisesDisponibles.size());
            paisAleatorio = (String) paisesDisponibles.toArray()[indiceAleatorio];
        } while (paisesPreguntados.contains(paisAleatorio));
        return paisAleatorio;
    }

    public static ArrayList<Usuario> obtenerJugadoresNombreyNota() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> notasJuegoCapitales = new ArrayList<>();

        boolean jugadores = true;
        do {
            notasJuegoCapitales.add(jugarCapitales(obtenerPaisesCapitales()));
            System.out.println("¿Hay más jugadores? (Sí/No)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("No")) {
                jugadores = false;
            }
        } while (jugadores);

        return notasJuegoCapitales;
    }

    public static HashMap<String, String> obtenerPaisesCapitales() throws FileNotFoundException {
        HashMap<String, String> paisesCapitales = new HashMap<>();

        String filePath = "countries.txt"; // La ruta es relativa al directorio de trabajo actual
        Scanner sc = new Scanner(new File(filePath));
        while (sc.hasNextLine()) {
            String lineaPaisCapital = sc.nextLine();
            if (!lineaPaisCapital.isEmpty() && !lineaPaisCapital.isBlank()) {
                String[] partes = lineaPaisCapital.split(" ");
                paisesCapitales.put(partes[0], partes[1]);
            }
        }
        sc.close();

        return paisesCapitales;
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

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Usuario> jugadores = obtenerJugadoresNombreyNota();
        for (Usuario jugador : jugadores) {
            System.out.println(jugador.toString());
        }
        guardarEnArchivo(jugadores, "usuarios.txt");
    }
}