package Controlador;
import Modelo.LectorDatos;
import Vista.Vista; 


public class App {
    public static void main(String[] args) {
        LectorDatos lectorDatos = new LectorDatos();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(lectorDatos, vista);
        controlador.iniciar();
    }
}