import org.junit.Test;

import static org.junit.Assert.*;

public class StringMethodHWTest {

    @Test
    public void alternateStrings1() {
        String result=StringMethodHW.alternateStrings("abc", "xyz");
        assertEquals("axbycz", result);
    }

    @Test
    public void alternateStrings2() {
        String result=StringMethodHW.alternateStrings("Hi", "There");
        assertEquals("HTihere", result);
    }

    @Test
    public void alternateStrings3() {
        String result=StringMethodHW.alternateStrings("xxxx", "Thereee");
        assertEquals("xTxhxexreee", result);
    }

    @Test
    public void alternateStrings4() {
        String result=StringMethodHW.alternateStrings("Thereee", "xxxx");
        assertEquals("Txhxexrxeee", result);
    }

    @Test
    public void alternateStrings5() {
        String result=StringMethodHW.alternateStrings("", "");
        assertEquals("", result);
    }

    @Test
    public void abcTest1() {
        boolean result=StringMethodHW.abcTest("123abc");
        assertEquals(true, result);
    }

    @Test
    public void abcTest2() {
        boolean result=StringMethodHW.abcTest("123.abc");
        assertEquals(false, result);
    }

    @Test
    public void abcTest3() {
        boolean result=StringMethodHW.abcTest("abc.123");
        assertEquals(true, result);
    }

    @Test
    public void abcTest4() {
        boolean result=StringMethodHW.abcTest("");
        assertEquals(false, result);
    }


}