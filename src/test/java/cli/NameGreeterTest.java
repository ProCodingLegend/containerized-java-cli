package cli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NameGreeterTest {

    @Test
    void greetingIncludesTheProvidedName() {
        NameGreeter greeter = new NameGreeter("ProCodingLegend");
        assertEquals("Hello, my name is ProCodingLegend.", greeter.greeting());
    }

    @Test
    void rejectsBlankName() {
        assertThrows(IllegalArgumentException.class, () -> new NameGreeter("   "));
    }
}
