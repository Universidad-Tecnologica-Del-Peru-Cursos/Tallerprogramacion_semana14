/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teoria.Vista;

import Teoria.Controlador.ControladorAlumno;
import Teoria.Modelo.Alumno;

/**
 *
 * @author c23421
 */
public class Ejecucion {
    public static void main(String[] args) {
        Alumno[] al=new Alumno[3];
        al[0]= new Alumno(1,"nombre 1");
        al[1]= new Alumno(2,"nombre 2");
        al[2]= new Alumno(3,"nombre 3");
        
       ControladorAlumno control=new ControladorAlumno(al);
       
       control.imprimir();
       control.eliminavalor(1);
       control.imprimir();
    }
}
