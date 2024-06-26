package Practica.Vista;
import Practica.Modelo.Producto;

public class ProductoView {
    public void mostrarProductos(Producto[] productos) {
        for (Producto producto : productos) {
            if (producto != null) {
                System.out.println(producto.toString());
                System.out.println("Código: " + producto.getCodigo());
               System.out.println("Imagen: " + producto.getImagen());
               System.out.println("Descripción: " + producto.getDescripcion());
               System.out.println("Precio: " + producto.getPrecio());
               System.out.println("Cantidad: " + producto.getCantidad());
               System.out.println("-----------------------------------");
            }
        }
    }
}
