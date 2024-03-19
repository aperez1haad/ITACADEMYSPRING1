package INTELIJ.SPRINT1TASCA7.N1EX1;

public class TreballadorOnline extends Treballador{
    private static final int tarifaPlana = 40;
    public TreballadorOnline(String nom, String apellido, int salarioHora) {
        super(nom, apellido, salarioHora);
    }
    @Override
    public int calcularSou(int horasTrabajadas){
        return (super.calcularSou(horasTrabajadas))+ tarifaPlana;

    }
}
