/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrafinal;

/**
 *
 * @author Alumno Mañana
 */
public class Empleado extends Persona{//no deja por que persona es final 
                                       //no puedes hacer que nadie extienda de ella
    @Override
    public void imprimir(){//No te permite ya que el void de la padre tiene en el metodo final
        System.out.println("Imprimiendo desde empleado");
    }
}
