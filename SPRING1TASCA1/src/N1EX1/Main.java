package N1EX1;

public class Main {

    public static void main(String[] args) {
        //instancias para demostrar carga de clases

        Vent vent1 = new Vent("Flauta", 30);
        vent1.tocar();

        Corda corda1 = new Corda("Guitarra", 60);
        corda1.tocar();


        Percussio percussio1 = new Percussio("Bateria", 300);
        percussio1.tocar();

        //acceso al estatic para demostrar la carga de clase
        System.out.println ("Acceso a miembro estatico de Corda: " + Corda.class.getSimpleName());

    }
}
