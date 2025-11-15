package morseconverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorseTest {

    @Test
    public void convertToA() {
        Logic converter = new Logic();
        assertEquals(".-", converter.convert("A"));
    }

    @Test
    public void convertTofel() {
        Logic converter = new Logic();
        assertEquals("-1", converter.convert("å"));
    }

}
