package INTELIJ.SPRINT1TASCA5.N1EX5;
import java.io.*;


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

    public void serializarDeserializar(){

        try{
        //Serializar
        FileOutputStream fileOuputStream = new FileOutputStream("fichero.ser"); // utilizo la clase FileOutputStrem para crear el archivo donde guardaré el objeto serializable
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOuputStream); // utilizo la clase ObjectOutputStream para transformar el objeto que quiera en bytes
                                                                                            // y le digo que lo guarde en el fichero que he creado en el entreparentesis.

        objectOutputStream.writeObject(this); // le digo que ese objeto (que transforme en bytes) es alumno1 y lo guarda.
        objectOutputStream.close(); // cierro el flujo de entrada de objetos al fichero creado.


        //Deserializar
        FileInputStream fileInputStream = new FileInputStream("fichero.ser"); // utilizo la clase FileInputStream para bajar el archivo donde están los objetos serializados (en el fichero.ser)
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream); //utilizo clase ObjectInputStream para transformar los bytes en el objeto
                                                                                        // y que lo saque del ficero fileInputStream (fichero.ser)
        Contacto alumno1enfichero = (Contacto) objectInputStream.readObject(); // guardo el objeto que lee en uno nuevo,
                                                                                // pero lo casteo porque yo espero un Contacto pero readObject me devuelve un Objeto tal cual, pues le digo que es un Contacto
        objectInputStream.close();  //cierro el flujo de entrada de objetos del fichero

        System.out.println(alumno1enfichero);

        }catch (IOException | ClassNotFoundException e) {
            System.out.println("No se ha podido escribir el archivo");
        }
    }
}
