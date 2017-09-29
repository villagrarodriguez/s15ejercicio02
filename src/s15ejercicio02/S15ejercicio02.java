/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s15ejercicio02;

/**
 *
 * @author alumno
 */
public class S15ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        curso curso01 = new curso("estructura de datos");
        curso curso02 = new curso("sistema de base de datos");
        
        curso01.agregarEstudiante("Peter Jones");
        curso01.agregarEstudiante("Kim Smith");
        curso01.agregarEstudiante("Pisco Ramirez");
        
        curso02.agregarEstudiante("Peter Jones");
        curso02.agregarEstudiante("Alondra Prado");
        System.out.println("");
        System.out.println("N° estudiantes - Curso01" + curso01.obternetNumeroEstudiantes());
        String []estudiantes c01 = curso01.obternetNumeroEstudiantes()

        
        
    }
    
    
    

}
