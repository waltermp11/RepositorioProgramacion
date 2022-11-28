package com.camada4.clase3;
import javax.swing.JOptionPane;


public class ejercicioClase3Desafio3 {

    int numero;
    int contador=0;
    int num=0;
    int contadorPrimo=1;


    public void digiteNumero (){

        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero:"));

    }

    public void  numerosPrimos(){

    while (numero>0){
            num++;

            while(contadorPrimo<=num){
                if (num%contadorPrimo==0){
                    contador++;
                }
                contadorPrimo++;
            }
        if (contador==2){

            System.out.println(num);
            numero = numero-1;

        }

    }


    }

    }
