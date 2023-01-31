package com.mycompany.ejercicio1vuky;

public class Main {

    public static void main(String[] args) {

        Pedro pedrito = new Pedro();
        ModeloPersona informacionPedro = new ModeloPersona();
        informacionPedro.setColorP("negro");
        informacionPedro.setEdad(25);
        informacionPedro.setNombre("esteban");
        pedrito.llenarInformacion(informacionPedro);
        pedrito.tocarPiano("hi");
        pedrito.caminar();
        System.out.println("Pedro tiene el color de pelo"
        + pedrito.informacionGlobal.getcolorPelo() + "se llama"
        + pedrito.informacionGlobal.getNombre() + "y tiene"
        + pedrito.informacionGlobal.getEdad() + "años");
        Pepita pepota = new Pepita();
        ModeloPersona informacionPepita = new ModeloPersona();
        informacionPepita.setColorP("rubia");
        informacionPepita.setNombre("susana");
        informacionPepita.setEdad(28);
        pepota.llenarInformacion(informacionPedro);
        pepota.caminar();
        pepota.tocarFlauta("lola");
    }
}
