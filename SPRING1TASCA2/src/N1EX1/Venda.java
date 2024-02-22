package INTELIJ.SPRING1TASCA2.src.N1EX1;
import java.util.ArrayList;

public class Venda {
    public ArrayList<Producte> productList;
    public double PreuTotal;

    public Venda() {
        this.productList = new ArrayList<Producte>();
        this.PreuTotal = 0;
    }

    public void addProduct(Producte p) {
        this.productList.add(p);
    }

    public ArrayList<Producte> getProductList() {
        return this.productList;
    }

    public void calcularTotal() throws VendaBuidaException {
        if (this.productList.isEmpty()) {
            throw new VendaBuidaException("Per fer una venda primer has d'afegir productes");
        }

        for (int i = 0; i < productList.size();i++) {
            PreuTotal += productList.get(i).getPreu();
        }
    }
    public double getPreuTotal() {
        return PreuTotal;
    }
}


