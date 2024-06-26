package Practica.Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductoModel {
    public static Producto[] 
        cargarProductos(String filePath, int maxProductos) throws IOException {
        Producto[] productos = new Producto[maxProductos];
        int count = 0;
        
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null && count < maxProductos) {
            String[] datos = line.split("\\|");
            String codigo = datos[0];
            String imagen = datos[1];
            String descripcion = datos[2];
            double precio = Double.parseDouble(datos[3]);
            int cantidad = Integer.parseInt(datos[4]);
            productos[count++] = new Producto(codigo, imagen, descripcion, precio, cantidad);
        }
        reader.close();
        
        return productos;
    }
}
