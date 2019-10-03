/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainn;

/**
 *
 * @author Juan Manuel Arreola
 */
public class Docente extends Persona{
   
    private String materia;
    private float sueldo;
            
    public Docente(String nombre, int edad, int matricula, String carrera, String sexo) {
        super(nombre, edad, matricula, carrera, sexo);
    }
    
    
    
}
