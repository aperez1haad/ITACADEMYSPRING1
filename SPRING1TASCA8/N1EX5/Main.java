package INTELIJ.SPRING1TASCA8.N1EX5;

interface ConseguirPi {
    double getPiValue();
}
interface OperacionMatematica{
    int operar (int a, int b);
}

public class Main {
    public static void main(String[] args) {
        //lambda para consignar el numero
        ConseguirPi numeropi = ()->3.1415;
        //invocar la lambda y mostrar el resutlado
        System.out.println("Valor de pi "+ numeropi.getPiValue());





        //Otro ejemplo para entender las lambdas
        OperacionMatematica suma=(a,b)->a+b;
        OperacionMatematica resta=(a,b)->a-b;
        System.out.println("Valor Suma: "+suma.operar(5,3));
        System.out.println("Valor Resta: "+resta.operar(5,3));
    }
}
