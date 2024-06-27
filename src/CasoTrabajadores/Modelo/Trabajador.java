package CasoTrabajadores.Modelo;

public class Trabajador{
    private String nombre;
    private String puesto;
    private double salario;

    public Trabajador(String nombre, 
    String puesto, double salario){
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNombre(){
        return nombre;
    }
    public String getPuesto(){
        return puesto;
    }
    public double getSalario(){
        return salario;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    public void setSalario(double salario) throws Exception{
        if (salario>0){
            this.salario = salario;
        }else{
            throw new Exception("Salario no valido");
        }
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "\n" +
        "Puesto: " + puesto + "\n" +
        "Salario: " + salario + "\n";
    }

    public static int ValidaNumero(String input) 
    throws NumberFormatException{
        try{
            return Integer.parseInt(input);
        }catch(NumberFormatException e){

            throw new 
            NumberFormatException("Numero no valido");
            
        }
        
    }

}