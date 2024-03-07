package N1EX1;

public class Percussio extends Instrument {
    public Percussio (String Nombre, int Preu) {
        super (Nombre, Preu);
    }
    @Override
    public void tocar () {
        System.out.println("Está sonando un instrumento de Percusion");
    }
}
