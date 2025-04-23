public class Validador {

    public static boolean validarNombre(String nombre) {
        return nombre.matches("^[A-Za-zÁÉÍÓÚáéíóúÑñ ]{2,}$");
    }

    public static boolean validarCorreo(String correo) {
        return correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    public static boolean validarContrasena(String contrasena) {
        return contrasena.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,}$");
    }
}