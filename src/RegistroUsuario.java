import java.util.Scanner;

// Clase principal RegistroUsuario para registrar un nuevo usuario
public class RegistroUsuario {

    // Método principal que se ejecuta al iniciar el programa
    public static void main(String[] args) {
        // Creación de un objeto Scanner para leer la entrada del usuario desde la
        // consola
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // Creación de un objeto Persona para almacenar la información del usuario
        Persona persona = new Persona();

        // Solicitar y establecer el DNI del usuario
        System.out.print("Ingrese el DNI: ");
        while (!persona.setDni(scanner.nextLine()));

        // Solicitar y establecer el correo electrónico del usuario
        System.out.print("Ingrese el correo electrónico: ");
        while (!persona.setCorreo(scanner.nextLine()));

        // Solicitar y establecer la contraseña del usuario
        System.out.print("Ingrese la contraseña: ");
        while (!persona.setContrasena(scanner.nextLine()));

        // Solicitar y establecer el nombre del usuario
        System.out.print("Ingrese el nombre: ");
        persona.setNombre(scanner.nextLine());

        // Solicitar y establecer los apellidos del usuario
        System.out.print("Ingrese los apellidos: ");
        persona.setApellidos(scanner.nextLine());

        // Solicitar y establecer la dirección postal del usuario
        System.out.print("Ingrese la dirección postal: ");
        persona.setDireccionPostal(scanner.nextLine());

        // Solicitar y establecer el código postal del usuario
        System.out.print("Ingrese el código postal: ");
        persona.setCodigoPostal(scanner.nextLine());

        // Solicitar y establecer el teléfono del usuario
        System.out.print("Ingrese el teléfono: ");
        persona.setTelefono(scanner.nextLine());

        // Solicitar y establecer la edad del usuario
        System.out.print("Ingrese la edad: ");
        while (!persona.setEdad(scanner.nextInt()));

        // Imprimir un mensaje de registro exitoso
        System.out.println("Registro exitoso!");
        // Imprimir los detalles del usuario
        System.out.println("Detalles del usuario:");
        System.out.println(persona);
    }
}