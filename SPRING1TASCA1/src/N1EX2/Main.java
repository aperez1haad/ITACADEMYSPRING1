package N1EX2;

public class Main {
    public static void main(String[] args) {
        Cotxe coche1 = new Cotxe();
        System.out.println(coche1.Potencia); // Como pertenece al objeto, puedo pedirlo
        System.out.println(Cotxe.Marca); // solo puedo pedirlo por la clase, no el objeto
        System.out.println(Cotxe.Model); // lo mismo que arriba

        //Cotxe.Marca = "Toyota"; // no lo puedo cambiar porque es final, sale error
        Cotxe.Model = "Ibiza"; // lo puedo cambiar

        Cotxe.frenar(); // como es static pertenece a la clase y lo llamo así
        coche1.accelerar(); // como no es static pertenece al objeto

        //Cotxe.accelerar(); // esto da error
        //coche1.frenar(); // esto no da error pero porque coche1 pertenece a Cotxe

    }
}
