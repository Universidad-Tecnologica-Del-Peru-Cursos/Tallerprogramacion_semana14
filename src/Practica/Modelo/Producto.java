package Practica.Modelo;

public class Producto {
    private String codigo;
    private String imagen;
    private String descripcion;
    private double precio;
    private int cantidad;

    public Producto(String codigo, String imagen, String descripcion, 
            double precio, int cantidad) {
        this.codigo = codigo;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getImagen() { return imagen; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", imagen='" + imagen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
