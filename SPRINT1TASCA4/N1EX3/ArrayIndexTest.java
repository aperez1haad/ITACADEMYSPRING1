package INTELIJ.SPRINT1TASCA4.N1EX3;
import org.junit.Test;
public class ArrayIndexTest {
    @Test (expected = IndexOutOfBoundsException.class)

    public void testArrayIndexOut(){
        ArrayIndexExcepcion x = new ArrayIndexExcepcion();
        x.ArrayIndexOutOfBounds();

    }
}
