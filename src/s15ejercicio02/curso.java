/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s15ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
class curso {
    private String nombreCurso;
    private ArrayList<String> estudiantes;
    
    //constructor
    public curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        estudiantes = new ArrayList<String>();
       
                   
              
        
    }
    public void agregarEstudiante(String estudiante) {
      estudiantes.add(estudiante);
    }
public void eliminarEstudiantes(String estudiante){
estudiantes.remove(estudiante);
}
public String[] obtenerEstudiantes(){
    String [] a= new String[estudiantes.size()];
return estudiantes.toArray(a);
 

}
public int obtenerNumEstudiantes(){
return estudiantes.size();
}
public String obtenertNombreCurso(){
return this.nombreCurso;
}
    
}
