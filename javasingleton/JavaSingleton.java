/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasingleton;

/**
 *
 * @author xavier
 */
public class JavaSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p;
        p=Persona.getInstance("Jose", "álvarez", 25);
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellido: " + p.getApellido());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Pasos: "+ p.getPasos());
        p.caminar();
        System.out.println("Pasos: "+ p.getPasos());
    }
    
}
