package com.camada4.clase3;
import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.*;

public class ejercicioClase3 {

    public static void main(String[] args) {

        System.out.println(desafio1());



    }


    static boolean desafio1(){

        String nombre1 = showInputDialog("ingrese el primer nombre del jugador:");
        String nombre2 = showInputDialog("ingrese el segundo nombre del jugador:");


        String  finalizar =" ";

        while (!finalizar.equals("*")){
            String opcion1 = showInputDialog("jugador 1:piedra, papel o tijera");
            finalizar = opcion1;
            if (opcion1.equals("*")){
                break;
            }
            String opcion2 = showInputDialog("jugador 2:piedra, papel o tijera");
            System.out.println(cualGana(opcion1,opcion2));


        }


        return false;
    }

    static   int cualGana(String opcion1, String opcion2){
            int ganador =0;
        if(opcion1.equals("tijera") && opcion2.equals("papel")){
            JOptionPane.showMessageDialog(null,"1");

        } else if (opcion1.equals("tijera") && opcion2.equals("piedra")) {
            ganador =2;
        }
        else if (opcion1.equals("tijera") && opcion2.equals("spock")) {
            ganador =2;
        }
        else if (opcion1.equals("tijera") && opcion2.equals("tijera")) {
            ganador= 0;
        }
        else if (opcion1.equals("papel") && opcion2.equals("tijeras")) {
            ganador =2;
        }
        else if (opcion1.equals("papel") && opcion2.equals("spock")) {
            ganador =1;
        }
        else if (opcion1.equals("papel") && opcion2.equals("piedra")) {
            ganador =1;
        }
        else if (opcion1.equals("papel") && opcion2.equals("papel")) {
            ganador =0;
        }
        else if (opcion1.equals("piedra") && opcion2.equals("papel")) {
            ganador =2;
        }
        else if (opcion1.equals("piedra") && opcion2.equals("spock")) {
            ganador =2;
        }
        else if (opcion1.equals("piedra") && opcion2.equals("tijeras")) {
            ganador =1;
        }
        else if (opcion1.equals("spock") && opcion2.equals("spock")) {
            ganador =0;
        }
        else if (opcion1.equals("spock") && opcion2.equals("tijera")) {
            ganador =1;
        }
        else if (opcion1.equals("spock") && opcion2.equals("papel")) {
            ganador =2;
        }
        else if (opcion1.equals("spock") && opcion2.equals("piedra")) {
            ganador =1;
        }





        return ganador;


    }
}
