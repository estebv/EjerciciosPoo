
package com.mycompany.ejercicio1vuky;


public class ModeloPersona{
    
 private String colorPelo;
 private  String nombre;
 private int edad;

    public String getcolorPelo() {
        return colorPelo;
    }
    public void setColorP(String colorPelo) {
        this.colorPelo = colorPelo;
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
            this.colorPelo = colorPelo;
            this.nombre = nombre;
            this.edad = edad;
    } 
    //sobrecarga
    public ModeloPersona(){
    }      
}

