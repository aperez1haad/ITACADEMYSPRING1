package INTELIJ.SPRINT1TASCA6.N1EX2;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Pérez", 30);
        String x = "IT Academy";
        int numero = 27;

        GenericMethods.imprimirArgumentos(persona, x, 27);
        GenericMethods.imprimirArgumentos(27, x, persona);
        GenericMethods.imprimirArgumentos(persona, 27, x);
    }
}
