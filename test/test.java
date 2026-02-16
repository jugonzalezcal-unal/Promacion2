import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

 class test {

    @Test
     void testValidUsernames() {
        assertTrue(taller.isValidUsername1("jhapontem_2"));
        assertTrue(taller.isValidUsername1("validUser123"));
    }


    @Test
    void testInvalidUsernames() {
        assertFalse(taller.isValidUsername1("4Carlos_")); // Comienza con dígito
        assertFalse(taller.isValidUsername1("user")); // Menos de 6 caracteres
        assertFalse(taller.isValidUsername1("verylongusername")); // Más de 12 caracteres
        assertFalse(taller.isValidUsername1("user@123")); // Caracter no permitido
    }
}
