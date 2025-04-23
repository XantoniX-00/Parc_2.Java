public class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;

    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public void mostrarDatos() {
        System.out.println("\nUsuario registrado correctamente:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
    }
}