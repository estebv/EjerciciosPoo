package com.mycompany.ejercicio1vuky;

public class Persona implements AccionPersona {

    public ModeloPersona informacionGlobal;

    public void llenarInformacion(ModeloPersona informacionlocal) {
        informacionGlobal = informacionlocal;

    }

    @Override
    public void caminar() {
    }

    @Override
    public void saltar() {
    }

    @Override
    public void gritar() {

    }
}

    
    

   

