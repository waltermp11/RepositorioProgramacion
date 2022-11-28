package com.camada4.clase3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Esta en dolares");
        Camion miCamion = new Camion("Ford","xxx"); //Aca creamos el objeto
        Camion.setCambiarValorCombustible(98.50);

        System.out.println("gasto "+miCamion.getGastoCombustible(13));

    }
}
