package Practica.Controlador;

import java.io.IOException;
import Practica.Modelo.Producto;
import Practica.Modelo.ProductoModel;
import Practica.Vista.ProductoView;

public class ProductoController {
    private ProductoView view;

    public ProductoController(ProductoView view) {
        this.view = view;
    }

    public void cargarYMostrarProductos(String filePath, int maxProductos) {
        try {
            Producto[] productos = ProductoModel.cargarProductos(filePath, maxProductos);
            view.mostrarProductos(productos);
        } catch (IOException e) {
            System.out.println("Error al cargar el archivo: " + e.getMessage());
        }
    }
}
