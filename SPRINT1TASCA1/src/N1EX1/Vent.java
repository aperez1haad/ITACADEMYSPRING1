package N1EX1;
public class Vent extends Instrument {
    public Vent (String Nombre, int Preu) {
        super (Nombre, Preu);
    }
    @Override
    public void tocar () {
        System.out.println("Está sonando un instrumento de Viento");
    }
}
