package Teoria.Controlador;
import Teoria.Modelo.Alumno;

public class ControladorAlumno {
    Alumno[] alumnos;

    public ControladorAlumno(Alumno[] alumnos){
        this.alumnos=new Alumno[alumnos.length];
        System.arraycopy(alumnos,0
                ,this.alumnos,0,
                alumnos.length);
    }
    
    public void imprimir(){
        for ( Alumno a: this.alumnos){
            System.out.println(a.getId()+" "+
                    a.getNombre());
        }
    }
    
    public void eliminavalor(int id){
        for(int i=0;i<this.alumnos.length;i++){
            if(alumnos[i].getId()==id){
                
                //////
                
                
            }
        }
    }

}
