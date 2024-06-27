package GestionTrabajadores.Modelo;

public class Trabajador {
    private String nombre;
    private String puesto;
    private double sueldo;

    public Trabajador(String nombre, String puesto, double sueldo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSueldo(double sueldo)throws Exception{
        if( sueldo>0)
            this.sueldo=sueldo;
        else
            throw new Exception("El sueldo no puede ser negativo");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
        "Puesto: " + puesto + "\n" +
        "Sueldo: " + sueldo + "\n";
    }

    public static int validaNnumeroString(String input)throws NumberFormatException{
        try
        {
            return Integer.parseInt(input);
        }
        catch(NumberFormatException e)
        {
            throw new NumberFormatException("El valor introducido no es un número");
        }
    }
}
