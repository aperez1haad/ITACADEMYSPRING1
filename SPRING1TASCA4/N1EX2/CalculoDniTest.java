package INTELIJ.SPRING1TASCA4.N1EX2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculoDniTest {
    @Test
    public void testCalcularLetraDni() {
        char letraCalculada1 = CalculoDni.CalcularLetraDni(12345678);
        assertEquals('Z', letraCalculada1);

        char letraCalculada2 = CalculoDni.CalcularLetraDni(87654321);
        assertEquals('X', letraCalculada2);

        char letraCalculada3 = CalculoDni.CalcularLetraDni(98765432);
        assertEquals('M', letraCalculada3);

        char letraCalculada4 = CalculoDni.CalcularLetraDni(54321678);
        assertEquals('W', letraCalculada4);

        char letraCalculada5 = CalculoDni.CalcularLetraDni(13579246);
        assertEquals('T', letraCalculada5);

        char letraCalculada6 = CalculoDni.CalcularLetraDni(24681357);
        assertEquals('B', letraCalculada6);

        char letraCalculada7 = CalculoDni.CalcularLetraDni(11111111);
        assertEquals('H', letraCalculada7);

        char letraCalculada8 = CalculoDni.CalcularLetraDni(22222222);
        assertEquals('J', letraCalculada8);

        char letraCalculada9 = CalculoDni.CalcularLetraDni(33333333);
        assertEquals('P', letraCalculada9);

        char letraCalculada10 = CalculoDni.CalcularLetraDni(44444444);
        assertEquals('A', letraCalculada10);


        // UNA MANERA MÁS CORTA DE HACERLO

        int[] numerosDNI = {12345678, 87654321, 98765432, 54321678, 13579246,
                24681357, 11111111, 22222222, 33333333, 44444444};
        char[] letrasEsperadas = {'Z', 'X', 'M', 'W', 'T', 'B', 'H', 'J', 'P', 'A'};

        for (int i = 0; i < numerosDNI.length; i++) {
            char letraCalculada = CalculoDni.CalcularLetraDni(numerosDNI[i]);
            assertEquals(letrasEsperadas[i], letraCalculada);
        }
    }
}


