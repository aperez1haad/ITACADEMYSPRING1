package INTELIJ.SPRING1TASCA2.src.N1EX1;

public class Main {

    public static void main(String[] args) {
        Venda vendatrimestral = new Venda();
        vendatrimestral.addProduct(new Producte("Pa", 1.5));
        vendatrimestral.addProduct(new Producte("Llet", 2.0));
        vendatrimestral.addProduct(new Producte("Oli", 150.0));
        vendatrimestral.addProduct(new Producte("Ous", 20.0));

        try {
            vendatrimestral.calcularTotal();
            System.out.println("Preu total: " + vendatrimestral.getPreuTotal());
            // Provocar ArrayIndexOutOfBoundsException
            // Accedint a un producte fora de l'índex
            Producte producteInaccessible = vendatrimestral.productList.get(6);
            System.out.println("Nom del producte: " + producteInaccessible.getNom());
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hi ha hagut un error: " + e.getMessage());
        }
    }

}
