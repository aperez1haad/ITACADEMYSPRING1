package N1EX1;
public abstract class Instrument {
    protected String Nombre;
    protected int Preu;


    public Instrument (String Nombre, int Preu) {
        this.Nombre = Nombre;
        this.Preu = Preu;
    }
    {
        System.out.println("bloque de inicializacion");
        //bloque de inicializacion: se ejecuta tantas veces como se instancie un objeto isntrumento,
    }
    static {
        System.out.println("bloque estatico en la clase instrumento");
        // bloque estatico: demuestra que carga la clase, solo una vez y al principio
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getPreu() {
        return Preu;
    }
    public void setPreu(int preu) {
        Preu = preu;
    }

    public String toString() {
        return "Instrument [Nombre=" + Nombre + ", Preu=" + Preu + "]";
    }
    public abstract void tocar();

}
