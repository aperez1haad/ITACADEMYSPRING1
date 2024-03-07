package INTELIJ.SPRINT1TASCA8.N1EX8;

interface CambiarOrdendeCharsdeStrings {
    String reverse(String s1);
}

public class Main {
    public static void main(String[] args) {

        CambiarOrdendeCharsdeStrings revertir = s1 -> {
            StringBuilder nuevoStringRevertido = new StringBuilder();
            for (int i = s1.length() - 1; i >= 0; i--) {
                nuevoStringRevertido.append(s1.charAt(i));
            }
            return nuevoStringRevertido.toString();
        };


        String x = "hola, que pasa!!!";
        String ResultadoRevertidoDeX = revertir.reverse(x);
        System.out.println(x);
        System.out.println(ResultadoRevertidoDeX);
    }
}
