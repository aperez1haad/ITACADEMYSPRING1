package INTELIJ.SPRING1TASCA2.src.N1EX1;

public class Producte {
    public String Nom;
    public double Preu;

    public Producte(String Nom, double Preu) {
        this.Nom = Nom;
        this.Preu = Preu;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public double getPreu() {
        return Preu;
    }

    public void setPreu(double preu) {
        Preu = preu;
    }
}
