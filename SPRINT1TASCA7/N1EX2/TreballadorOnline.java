package INTELIJ.SPRINT1TASCA7.N1EX2;

public class TreballadorOnline extends Treballador {
    private static final int TARIFAPLANA = 40;
    public TreballadorOnline(String nom, String apellido, int salariohora) {
        super(nom, apellido, salariohora);
    }
    @Override
    public int CalcularSou(int HorasTrabajadas){
        return (super.CalcularSou(HorasTrabajadas))+TARIFAPLANA;
    }
    @Deprecated
    public int MetodoDeprecatedCalcularSouOnline(int HorasTrabajadas){
        return (super.CalcularSou(HorasTrabajadas))+TARIFAPLANA+150;
    }
}
