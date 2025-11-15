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
    public void convertToAx3() {
        Logic converter = new Logic();
        assertEquals(".- .- .-", converter.convert("A A A"));
    }

    @Test
    public void convertToHey() {
        Logic converter = new Logic();
        assertEquals("HEY", converter.convert(".... . -.--"));
    }

    @Test
    public void convertTofel1() {
        Logic converter = new Logic();
        assertEquals("Fel 1!", converter.convert("......."));
    }
    @Test
    public void convertTofel2() {
        Logic converter = new Logic();
        assertEquals("Fel 2!", converter.convert("å"));
    }

    @Test
    public void convertTofel3() {
        Logic converter = new Logic();
        assertEquals("Fel 2!  Fel 2!", converter.convert("<^"));
    }

}
