package Controlador;
import Modelo.LectorDatos;
import Vista.Vista;

class Controlador {
    private LectorDatos lectorDatos;
    private Vista vista;

    public Controlador(LectorDatos lectorDatos, Vista vista) {
        this.lectorDatos = lectorDatos;
        this.vista = vista;
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            vista.mostrarMenu();
            int opcion = lectorDatos.leerEntero("Seleccione una opción: ");
            switch (opcion) {
                case 1:
                    int entero = lectorDatos.leerEntero("Ingrese un número entero: ");
                    vista.mostrarMensaje("El número entero ingresado es: " + entero);
                    break;
                case 2:
                    double decimal = lectorDatos.leerDouble("Ingrese un número decimal: ");
                    vista.mostrarMensaje("El número decimal ingresado es: " + decimal);
                    break;
                case 3:
                    char caracter = lectorDatos.leerChar("Ingrese un carácter: ");
                    vista.mostrarMensaje("El carácter ingresado es: " + caracter);
                    break;
                case 4:
                    String cadena = lectorDatos.leerCadena("Ingrese una cadena: ");
                    vista.mostrarMensaje("La cadena ingresada es: " + cadena);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida. Por favor, intente nuevamente.");
            }
        }
        lectorDatos.cerrar();
    }
}