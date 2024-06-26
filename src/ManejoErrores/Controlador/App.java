package ManejoErrores.Controlador;
import ManejoErrores.Modelo.LectorDatos;
import ManejoErrores.Vista.Vista;

public class App {
    public static void main(String[] args) {
        LectorDatos lectorDatos = new LectorDatos();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(lectorDatos, vista);
        controlador.iniciar();
    }
}