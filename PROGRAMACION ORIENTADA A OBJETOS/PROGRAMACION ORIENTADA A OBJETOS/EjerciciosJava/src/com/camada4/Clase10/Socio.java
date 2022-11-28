package com.camada4.Clase10;

public class Socio {
    private String nombre;
    private String numerosocio;
    private Double cuotaMensual;
    private String actividad;

    public Socio(String nombre, String numerosocio, Double cuotaMensual, String actividad) {
        this.nombre = nombre;
        this.numerosocio = numerosocio;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public Socio (){

    }


    public  Double calcularCuotaMensual(){
        return cuotaMensual;

    }
}
