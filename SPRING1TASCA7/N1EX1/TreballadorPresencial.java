package INTELIJ.SPRING1TASCA7.N1EX1;

public class TreballadorPresencial extends Treballador{
    private static int Benzina = 150;
    public TreballadorPresencial(String nom, String apellido, int salariohora) {
        super(nom, apellido, salariohora);
    }
    @Override
    public int CalcularSou(int HorasTrabajadas) {
        return (super.CalcularSou(HorasTrabajadas))+Benzina;
    }
}
