package Practica.Vista;
import Practica.Controlador.ProductoController;
public class Main {
    public static void main(String[] args) {
        ProductoView view = new ProductoView();
        ProductoController controller = new ProductoController(view);

        String filePath = "productos.txt"; // Ruta del archivo
        int maxProductos = 100; // Ajusta el tamaño máximo según sea necesario
        controller.cargarYMostrarProductos(filePath, maxProductos);
    }
}
