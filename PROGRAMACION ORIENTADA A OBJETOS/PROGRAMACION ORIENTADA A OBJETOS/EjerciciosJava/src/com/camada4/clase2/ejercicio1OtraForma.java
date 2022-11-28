package com.camada4.clase2;
import javax.swing.JOptionPane;


public class ejercicio1OtraForma {

    public static void main(String[] args) {

    JOptionPane.showMessageDialog(null,"Ejercicio de otra forma");
    int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
    int operacion=0;
        System.out.println(numeroPrimo ( numero));


    }

    static int numeroPrimo (int num){

        int contador=0;
        for (int i = 1; i<=num; i++){

            int operacion=num%i;

            if (operacion==0){
                contador+=1;

            }

        }
        if(contador==2){
            JOptionPane.showMessageDialog(null,"El"+num+" es primo");


        }

        else {
            JOptionPane.showMessageDialog(null,"El"+num+" no es primo");
        }

        return num;
    }


}
