
// Importación de las clases Assertions y Test de JUnit
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Importación de la anotación Test de JUnit
import org.junit.jupiter.api.Test;

// Definición de la clase PersonaTest para las pruebas unitarias de la clase Persona
public class PersonaTest {
    // TESTS DE EDAD CLASE PERSONA

    // Prueba para verificar que establecer la edad a exactamente 18 sea válido
    @Test
    public void testEdadValidaExactamente18() {
        // Creación de una nueva instancia de la clase Persona
        Persona persona = new Persona();

        // Llamada al método setEdad con el valor 18 y verificación del resultado
        assertTrue(persona.setEdad(18), "La edad de 18 debería ser válida.");
    }

    // Prueba para verificar que establecer la edad a un valor mayor que 18 sea
    // válido
    @Test
    public void testEdadValidaMayorA18() {
        // Creación de una nueva instancia de la clase Persona
        Persona persona = new Persona();

        // Llamada al método setEdad con el valor 25 y verificación del resultado
        assertTrue(persona.setEdad(25), "La edad de 25 debería ser válida.");
    }

    // Prueba para verificar que establecer la edad a un valor menor que 18 sea
    // inválido
    @Test
    public void testEdadInvalidaMenorA18() {
        // Creación de una nueva instancia de la clase Persona
        Persona persona = new Persona();

        // Llamada al método setEdad con el valor 17 y verificación del resultado
        assertFalse(persona.setEdad(17), "La edad de 17 debería ser inválida.");
    }

    // Prueba para verificar que establecer la edad a 0 sea inválido
    @Test
    public void testEdadInvalidaLimiteInferior() {
        // Creación de una nueva instancia de la clase Persona
        Persona persona = new Persona();

        // Llamada al método setEdad con el valor 0 y verificación del resultado
        assertFalse(persona.setEdad(0), "La edad de 0 debería ser inválida.");
    }

    // TESTS DE CONTRASEÑAS CLASE PERSONA
    public void testContrasenaValidaMasDe8Caracteres() {
        // Crear una instancia de Persona
        Persona persona = new Persona();
        // Llamar al método setContrasena con una contraseña de más de 8 caracteres
        assertTrue(persona.setContrasena("contrasena123"), "La contraseña debería ser válida.");
    }

    // Prueba para verificar que una contraseña con 8 caracteres sea inválida
    @Test
    public void testContrasenaInvalida8Caracteres() {
        // Crear una instancia de Persona
        Persona persona = new Persona();
        // Llamar al método setContrasena con una contraseña de exactamente 8 caracteres
        assertFalse(persona.setContrasena("contra12"), "La contraseña debería ser inválida.");
    }

}
