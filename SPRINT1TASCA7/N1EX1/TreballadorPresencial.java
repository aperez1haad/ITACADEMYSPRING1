package INTELIJ.SPRINT1TASCA7.N1EX1;

public class TreballadorPresencial extends Treballador{
    private static int benzina = 150;
    public TreballadorPresencial(String nom, String apellido, int salarioHora) {
        super(nom, apellido, salarioHora);
    }
    @Override
    public int calcularSou(int horasTrabajadas) {
        return (super.calcularSou(horasTrabajadas))+ benzina;
    }
}
