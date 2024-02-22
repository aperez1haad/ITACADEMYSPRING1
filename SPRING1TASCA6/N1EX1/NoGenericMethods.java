package INTELIJ.SPRING1TASCA6.N1EX1;

public class NoGenericMethods {
    private Object objeto1;
    private Object objeto2;
    private Object objeto3;

    public NoGenericMethods(Object objeto1, Object objeto2, Object objeto3) {
        this.objeto1 = objeto1;
        this.objeto2 = objeto2;
        this.objeto3 = objeto3;
    }

    public void modificarObjeto(int posicion, Object objeto) {
        if (posicion < 1 || posicion > 3) {
            throw new IllegalArgumentException("Posicion fuera de rango");
        }
        switch (posicion) {
            case 1:
                objeto1 = objeto;
                break;
            case 2:
                objeto2 = objeto;
                break;
            case 3:
                objeto3 = objeto;
                break;
        }
    }
    public Object extraer(int posicion) {
        if (posicion < 1 || posicion > 3) {
            throw new IllegalArgumentException("Posicion fuera de rango");
        }
        Object objeto = null;
        switch (posicion) {
            case 1:
                objeto = objeto1;
            break;
            case 2:
                objeto = objeto2;
            break;
            case 3:
                objeto = objeto3;
            break;
        }
        return objeto;
    }

    // comprobamos:
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

