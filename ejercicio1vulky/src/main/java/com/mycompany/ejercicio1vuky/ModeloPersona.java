
package com.mycompany.ejercicio1vuky;


public class ModeloPersona{
    
 private String colorP;
 private  String nombre;
 private int edad;

    public String getColorP() {
        return colorP;
    }

    public void setColorP(String colorP) {
        this.colorP = colorP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
 
 
    
    
    public ModeloPersona (String colorPelo,String nombre, int edad){
            this.colorP = colorPelo;
            this.nombre = nombre;
            this.edad = edad;
    } 
    //sobrecarga
    public ModeloPersona(){
    }
            
}

