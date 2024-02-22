package INTELIJ.SPRING1TASCA3.N1EX3;

public class Usuario {

    protected String Nombre;
    protected int Nota;

    public Usuario (String Nombre, int Nota) {
        this.Nombre = Nombre;
        this.Nota = Nota;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Nombre='" + Nombre + '\'' +
                ", Nota=" + Nota +
                '}';
    }
}
