/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author chalosalvador
 */
public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = p1;
        
        System.out.println("CONTADOR GLOBAL: " + Persona.contador);
        System.out.println("ID p2: " + p1.getId());
        System.out.println("ID p3: " + p2.getId());
        
    
        p1.setNombre("Juan");
        p1.setApellido("Perez");
  
        p2.setNombre("Maria");
        p2.setApellido("Sanchez");
        
        
        if(p1.equals(p2)) {
            System.out.println("SON IGUALES");
        } else {
            System.out.println("NO SON IGUALES");
        }
        
        
        System.out.println("PERSONA 1: " + p1);
        System.out.println("PERSONA 2: " + p2);
        
//        if(p1.equals(p1)) {
//            System.out.println("SON IGUALES");
//        } else {
//            System.out.println("NO SON IGUALES");
//        }
//        
//        if(p1.equals(p3)) {
//            System.out.println("SON IGUALES");
//        } else {
//            System.out.println("NO SON IGUALES");
//        }
    }
}
