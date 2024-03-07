package INTELIJ.SPRING1TASCA6.N1EX1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods noGenericMethods1 = new NoGenericMethods("Primer objecte", "Segon objecte", "Tercer objecte");
        NoGenericMethods noGenericMethods2 = new NoGenericMethods("Segon objecte", "Primer objecte",  "Tercer objecte");
        NoGenericMethods noGenericMethods3 = new NoGenericMethods("Tercer objecte", "Segon objecte", "Primer objecte");

        System.out.println(noGenericMethods1.extraer(1)); // Debería imprimir "Primer objecte"
        System.out.println(noGenericMethods2.extraer(2)); // Debería imprimir "Primer objecte"
        System.out.println(noGenericMethods3.extraer(3)); // Debería imprimir "Primer objecte"

        noGenericMethods1.modificarObjeto(1,"Primer objeto nuevo");
        System.out.println(noGenericMethods1.extraer(1));

    }
}
