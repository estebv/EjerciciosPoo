package com.mycompany.ejercicio1vuky;

public class Persona implements AccionPersona {

    public ModeloPersona informacionGlobal;

    public void llenarInformacion(ModeloPersona informacionlocal) {
        informacionGlobal = informacionlocal;
    }

    @Override
    public void caminar() {
        System.out.print("cojo");
    }

    @Override
    public void saltar() {
           System.out.print("con un pie");
    }

    @Override
    public void gritar() {
           System.out.print("sin lengua");

    }
}

    
    

   

