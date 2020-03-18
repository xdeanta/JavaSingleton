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
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int pasos = 0;
    private static Persona instancia;

    private Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public static Persona getInstance (String nombre, String apellido, int edad) {
        if (instancia==null) {
            instancia = new Persona(nombre,apellido,edad);
        }
        return instancia;
    }
    
    public void caminar(){
        pasos++;
    }

    public int getPasos() {
        return pasos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

}
