package ManejoErrores.Vista;

public class Vista {
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMenu() {
        System.out.println("1. Ingresar un número entero");
        System.out.println("2. Ingresar un número decimal");
        System.out.println("3. Ingresar un carácter");
        System.out.println("4. Ingresar una cadena");
        System.out.println("5. Salir");
    }
}