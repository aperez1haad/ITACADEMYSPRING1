package N1EX2;

public class Cotxe {
    // static final = es comun y no se puede cambiar, todos los coches son Seat
    static final String Marca = "Seat";
    // static = es comun, pertenece a la clase Coche y no a las instancias, todos seran Leon, se puede cambiar
    static String Model = "Leon";
    // final = no se podrá cambiar, el atributo pertenecera al objeto y no a la clase, aunque todos tendrán el mismo valor
    public final int Potencia = 110;

    public Cotxe (){
    }
    // es una funcion global de la clase coche, no de instanciar un objeto tipo coche
    static void frenar(){
        System.out.println("El cotxe està frenant");
    }
    public void accelerar(){
        System.out.println("El cotxe està accelerant");
    }
}
