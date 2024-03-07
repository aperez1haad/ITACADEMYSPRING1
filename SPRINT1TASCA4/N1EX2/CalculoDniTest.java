package INTELIJ.SPRINT1TASCA4.N1EX2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class CalculoDniTest {
    private int dni;
    private char letraEsperada;

    public CalculoDniTest(int dni, char letraEsperada) {
        this.dni = dni;
        this.letraEsperada = letraEsperada;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> DNISdePrueba() {
        return Arrays.asList(new Object[][] {
                { 12345678, 'Z' },
                { 87654321, 'X' },
                { 98765432, 'M' },
                { 54321678, 'W' },
                { 13579246, 'T' },
                { 24681357, 'B' },
                { 11111111, 'H' },
                { 22222222, 'J' },
                { 33333333, 'P' },
                { 44444444, 'A' }
        });
    }
    @Test
    public void testCalcularLetraDni() {
        char letraCalculada = CalculoDni.CalcularLetraDni(dni);
        assertEquals(letraEsperada, letraCalculada);
    }
}


