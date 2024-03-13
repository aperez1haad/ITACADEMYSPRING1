package INTELIJ.SPRINT1TASCA7.N1EX1;

public class Main {
    public static void main(String[] args) {
        TreballadorPresencial JuanPresencial = new TreballadorPresencial("Juan", "García", 15);
        TreballadorOnline AnnaOnline = new TreballadorOnline("Ana", "Martínez", 20);

        int horasTrabajadas = 40*4;

        // Demostración del cálculo de sueldos
        System.out.println("Sueldo de Juan: " + JuanPresencial.calcularSou(horasTrabajadas));
        System.out.println("Sueldo de Anna: " + AnnaOnline.calcularSou(horasTrabajadas));
    }
}

