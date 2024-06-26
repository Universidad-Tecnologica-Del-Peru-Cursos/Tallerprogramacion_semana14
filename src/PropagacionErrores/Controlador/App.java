package PropagacionErrores.Controlador;
import PropagacionErrores.Modelo.LectorDatos;
import PropagacionErrores.Vista.Vista;
public class App {
    public static void main(String[] args) {
        LectorDatos lectorDatos = new LectorDatos();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(lectorDatos, vista);
        controlador.iniciar();
    }
}