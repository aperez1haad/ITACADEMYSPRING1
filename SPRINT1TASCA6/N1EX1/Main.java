package INTELIJ.SPRINT1TASCA6.N1EX1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods noGenericMethods1 = new NoGenericMethods("Primer String", "Segon String", "Tercer String");
        NoGenericMethods noGenericMethods2 = new NoGenericMethods("Segon String", "Primer String",  "Tercer String");
        NoGenericMethods noGenericMethods3 = new NoGenericMethods("Tercer String", "Segon String", "Primer String");

        System.out.println(noGenericMethods1.extraer(1)); // Debería imprimir "Primer String"
        System.out.println(noGenericMethods2.extraer(2)); // Debería imprimir "Primer String"
        System.out.println(noGenericMethods3.extraer(3)); // Debería imprimir "Primer String"

        noGenericMethods1.modificarObjeto(1,"Primer String nuevo");
        System.out.println(noGenericMethods1.extraer(1));

    }
}
