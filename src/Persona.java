import java.util.regex.Pattern;
import java.util.regex.Matcher;

// Definición de la clase Persona para representar a un individuo
class Persona {
    // Atributos de la clase Persona
    private String dni;
    private String correo;
    @SuppressWarnings("unused")
    private String contrasena;
    private String nombre;
    private String apellidos;
    private String direccionPostal;
    private String codigoPostal;
    private String telefono;
    private int edad;

    // Método para establecer el DNI de la persona
    public boolean setDni(String dni) {
        // Validar que el DNI tenga 8 dígitos
        if (dni.matches("\\d{8}")) {
            this.dni = dni;
            return true; // DNI válido
        } else {
            System.out.println("DNI no válido. Debe tener 8 dígitos.");
            return false; // DNI inválido
        }
    }

    // Método para establecer el correo electrónico de la persona
    public boolean setCorreo(String correo) {
        // Expresión regular para validar el formato del correo electrónico
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        // Compilar la expresión regular en un patrón
        Pattern pattern = Pattern.compile(regex);
        // Crear un objeto Matcher para hacer coincidir el correo con el patrón
        Matcher matcher = pattern.matcher(correo);
        // Verificar si el correo coincide con el patrón
        if (matcher.matches()) {
            this.correo = correo;
            return true; // Correo válido
        } else {
            System.out.println("Correo electrónico no válido.");
            return false; // Correo inválido
        }
    }

    // Método para establecer la contraseña de la persona
    public boolean setContrasena(String contrasena) {
        // Validar que la contraseña tenga más de 8 caracteres
        if (contrasena.length() > 8) {
            this.contrasena = contrasena;
            return true; // Contraseña válida
        } else {
            System.out.println("Contraseña no válida. Debe tener más de 8 caracteres.");
            return false; // Contraseña inválida
        }
    }

    // Métodos para establecer los atributos de la persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para establecer la edad de la persona
    public boolean setEdad(int edad) {
        // Validar que la edad sea mayor o igual a 18
        if (edad >= 18) {
            this.edad = edad;
            return true; // Edad válida
        } else {
            System.out.println("Debes ser mayor de 18 años.");
            return false; // Edad inválida
        }
    }

    // Método toString para obtener una representación en cadena de la persona
    @Override
    public String toString() {
        return "DNI: " + dni + "\n" +
                "Correo: " + correo + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "Dirección Postal: " + direccionPostal + "\n" +
                "Código Postal: " + codigoPostal + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Edad: " + edad;
    }
}
