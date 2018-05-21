/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author chalosalvador
 */
public class Persona {

    public static int contador = 0;
    private int id;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String cedula;
      
    public Persona() {}
    
    // Getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    public String getCedula(){
        return this.cedula;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void setCedula(String cedula) {
        if(cedulaValida(cedula)) {
            this.cedula = cedula;
        } else {
            System.out.println("Cédula no válida");
        }
    }
    
    // Metodos privados
    private boolean cedulaValida(String cedula) {
        // TODO Implementar algoritmo de validación
        return false;
    }
    
    
    /**
     * @param args the command line arguments
     * @return 
     */
//    public static void main(String[] args) {
//        Persona p = new Persona();
//        System.out.println("El nombre de p es: " + p.nombre);
//        
//        p.nombre = "Carlos";
//        p.apellido = "Salvador";
//        p.fechaNacimiento = new Date("1986/05/03");
//        System.out.println("El nombre de p es: " + p.nombre);
//        
//       
//        Persona p1 = new Persona("Chalo");
//        System.out.println("El nombre de p1 es: " + p1.nombre);
//        System.out.println("El nombre de p es: " + p.nombre);
//        
//        p.nombre = p.nombre + " Juan";
//        System.out.println("El nombre de p es: " + p.nombre);
//        
//        p.setCedula("0923950778");
//        p.setCedula("1231231233");
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Override
    public boolean equals(Object obj) {
        final Persona otraPersona = (Persona) obj;
        if(!this.nombre.equals(otraPersona.nombre) || 
           !this.apellido.equals(otraPersona.apellido)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Apellido: " + this.apellido;
    }
    
   
}
