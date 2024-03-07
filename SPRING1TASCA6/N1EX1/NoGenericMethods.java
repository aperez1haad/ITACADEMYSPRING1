package INTELIJ.SPRING1TASCA6.N1EX1;

public class NoGenericMethods {
    private String String1;
    private String String2;
    private String String3;

    public NoGenericMethods(String String1, String String2, String String3) {
        this.String1 = String1;
        this.String2 = String2;
        this.String3 = String3;
    }

    public void modificarObjeto(int posicion, String Stringx) {
        if (posicion < 1 || posicion > 3) {
            throw new IllegalArgumentException("Posicion fuera de rango");
        }
        switch (posicion) {
            case 1:
                String1 = Stringx;
                break;
            case 2:
                String2 = Stringx;
                break;
            case 3:
                String3 = Stringx;
                break;
        }
    }
    public String extraer(int posicion) {
        if (posicion < 1 || posicion > 3) {
            throw new IllegalArgumentException("Posicion fuera de rango");
        }
        String Stringx = null;
        switch (posicion) {
            case 1:
                Stringx = String1;
            break;
            case 2:
                Stringx = String2;
            break;
            case 3:
                Stringx = String3;
            break;
        }
        return Stringx;
    }
}

