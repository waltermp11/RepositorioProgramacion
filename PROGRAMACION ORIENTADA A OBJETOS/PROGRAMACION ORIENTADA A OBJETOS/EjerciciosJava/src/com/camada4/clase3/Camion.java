package com.camada4.clase3;



public class Camion {


    private String marca;
    private String patente;
    static private double valorCombustible; // Ya que es una variable igual para todos los objetos, sera la misma


    //creo el metodo constructor

    public Camion(String marca, String patente){
        this. marca=marca;
        this. patente = patente;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public static double getValorCombustible() {
        return valorCombustible;
    }

    public static void setValorCombustible(double valorCombustible) {
        Camion.valorCombustible = valorCombustible;
    }

    public double getGastoCombustible(int litros){
        return litros*valorCombustible;
    }

    static public  void setCambiarValorCombustible (double precio){
        Camion.valorCombustible=precio;

    }
}

