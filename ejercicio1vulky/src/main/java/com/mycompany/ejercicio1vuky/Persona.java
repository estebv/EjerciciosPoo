package com.mycompany.ejercicio1vuky;

public class Persona implements AccionPersona {

    public ModeloPersona informacionGlobal;

    public void llenarInformacion(ModeloPersona informacionlocal) {
        informacionGlobal = informacionlocal;
    }

    @Override
    public void caminar() {
        System.out.println("cojo");
    }

    @Override
    public void saltar() {
           System.out.println("con un pie");
    }

    @Override
    public void gritar() {
           System.out.println("sin lengua");

    }
}

    
    

   

