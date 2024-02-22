package INTELIJ.SPRING1TASCA4.N1EX1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MesesTest {
    @Test
    public void testListaTiene12Posiciones() {
        Meses meses = new Meses();
        assertEquals(12, meses.getMeses().size());
    }
    @Test
    public void testListaNoEsNula() {
        Meses meses = new Meses();
        assertNotNull(meses.getMeses());
    }
    @Test
    public void testPosicion8ContieneAgosto() {
        Meses meses = new Meses();
        assertEquals("Agosto", meses.getMeses().get(7));
    }
}
