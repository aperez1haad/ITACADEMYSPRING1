package INTELIJ.SPRINT1TASCA6.N1EX2;

public class Persona {
    private String nom;
    private String apellido;
    private int edad;

    public Persona(String nom, String apellido, int edad) {
        this.nom = nom;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
