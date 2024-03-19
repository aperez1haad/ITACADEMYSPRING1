package INTELIJ.SPRINT1TASCA7.N1EX2;

public class Treballador {
    protected String nom;
    protected String apellido;
    protected int salarioHora;

    public Treballador(String nom, String apellido , int salarioHora) {
        this.nom = nom;
        this.apellido = apellido;
        this.salarioHora = salarioHora;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
