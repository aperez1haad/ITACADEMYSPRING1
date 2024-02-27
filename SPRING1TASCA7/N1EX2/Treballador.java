package INTELIJ.SPRING1TASCA7.N1EX2;

public class Treballador {
    protected String Nom;
    protected String Apellido;
    protected int Salariohora;

    public Treballador(String nom, String apellido, int salariohora) {
        Nom = nom;
        Apellido = apellido;
        Salariohora = salariohora;
    }
    public String getNom() {
        return Nom;
    }
    public void setNom(String nom) {
        Nom = nom;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public int getSalariohora() {
        return Salariohora;
    }
    public void setSalariohora(int salariohora) {
        Salariohora = salariohora;
    }
    public int CalcularSou(int HorasTrabajadas){
        return HorasTrabajadas*Salariohora;
    }
}
