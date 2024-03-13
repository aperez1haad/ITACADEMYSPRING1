package INTELIJ.SPRINT1TASCA7.N1EX1;

public class Treballador {
    protected String Nom;
    protected String Apellido;
    protected int salarioHora;

    public Treballador(String Nom, String Apellido, int salarioHora) {
        this.Nom = Nom;
        this.Apellido = Apellido;
        this.salarioHora = salarioHora;
    }
    public String getNom() {
        return Nom;
    }
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public int getSalarioHora() {
        return salarioHora;
    }
    public void setSalarioHora(int salarioHora) {
        this.salarioHora = salarioHora;
    }
    public int calcularSou(int horasTrabajadas){
        return horasTrabajadas* salarioHora;
    }
}
