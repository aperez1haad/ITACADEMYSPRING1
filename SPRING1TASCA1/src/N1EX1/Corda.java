package N1EX1;
public class Corda extends Instrument {
    public Corda (String Nombre, int Preu) {
        super (Nombre, Preu);
    }

    @Override
    public void tocar () {
        System.out.println("Está sonando un instrumento de Cuerda");
    }
}
