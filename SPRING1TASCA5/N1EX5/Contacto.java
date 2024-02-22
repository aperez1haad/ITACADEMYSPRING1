package INTELIJ.SPRING1TASCA5.N1EX5;
import java.io.Serializable;


public class Contacto implements Serializable {
    private String nombre;
    private int edad;
    // si pongo un atributo transient; no se serializará . Ejemplo : private transient String dirección. En el main con el ejercicio pondrá null.
    // si pongo un atributo static tampoco se serializará porque dependerá de la clase y no del objeto que es lo serializo.
    // si dentro de Contacto pongo una clase (Animalquetiene) por ejemplo, no pasa nada, pero tendrá que poner implements Serializable en la clase Animalquetiene también
    public Contacto (String nombre, int edad){
        this.nombre=nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Contacto: " +
                "nombre= '" + nombre + '\'' +
                ", edad= " + edad;
    }
}
