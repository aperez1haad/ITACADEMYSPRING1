package INTELIJ.SPRING1TASCA4.N1EX2;
public class CalculoDni {
    public static char CalcularLetraDni(int numeroDNI) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(Math.round(numeroDNI % 23));
    }
}