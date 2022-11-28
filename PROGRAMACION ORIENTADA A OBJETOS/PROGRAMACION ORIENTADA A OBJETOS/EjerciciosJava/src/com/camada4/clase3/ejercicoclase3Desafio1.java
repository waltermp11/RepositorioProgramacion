package com.camada4.clase3;
import java.util.Scanner;



/* Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
cuando el primero elije “*” como indicador de final.*/

public class ejercicoclase3Desafio1 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre jugador 1:");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese su nombre jugador 2:");
        String nombre2 = scanner.nextLine();

        String opcion1;
        String opcion2;
        do {
            //digitacion de los nombres de los jugadores




            System.out.println("Escoja su opcion para jugar:\n" +
                    "1.tijera\n" +
                    "2.piedra\n" +
                    "3.papel\n" +
                    "4. Spock"+
                    "* para finalizar partida.");
            opcion1 = scanner.nextLine();

            System.out.println("Escoja su opcion para jugar:\n" +
                    "1.tijera\n" +
                    "2.piedra\n" +
                    "3.papel\n" +
                    "4. Spock");
            opcion2 = scanner.nextLine();

            System.out.println(cualGana(opcion1, opcion2));


        } while (!opcion1.equals("*"));


    }





    static int cualGana (String opcion1, String opcion2){
        int ganador = 0;

        if(opcion1.equals("tijera") && opcion2.equals("piedra")){
            System.out.println("Gano el jugador 2");
            ganador=2;
        } else if (opcion1.equals("tijera") && opcion2.equals("papel")) {
            System.out.println("Gano el jugador 1");
            ganador=1;
        }
        else if (opcion1.equals("tijera") && opcion2.equals("spock")) {
            ganador =2;
        }else if (opcion1.equals("tijera") && opcion1.equals("tijera")) {
            System.out.println("Empataron");
            ganador=0;
        }else if (opcion1.equals("piedra") && opcion2.equals("tijera")) {
            System.out.println("Gano el jugador 1");
            ganador=1;
        }else if (opcion1.equals("piedra") && opcion2.equals("piedra")) {
            System.out.println("Empataron");
            ganador=0;
        }else if (opcion1.equals("piedra") && opcion2.equals("papel")) {
            System.out.println("Gano jugador 2");
            ganador=2;
        }
        else if (opcion1.equals("piedra") && opcion2.equals("spock")) {
            ganador =2;
        }else if (opcion1.equals("papel") && opcion2.equals("tijera")) {
            System.out.println("Gano el jugador 2");
            ganador=2;
        }
        else if (opcion1.equals("papel") && opcion2.equals("spock")) {
            ganador =1;
        }else if (opcion1.equals("papel") && opcion2.equals("piedra")) {
            System.out.println("Gano el jugador 1");
            ganador=1;
        }else if (opcion1.equals("papel") && opcion2.equals("papel")) {
            System.out.println("empataron");
            ganador=0;
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


