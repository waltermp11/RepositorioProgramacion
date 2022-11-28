

package com.camada4.clase2;

import javax.swing.JOptionPane;

public class ejercicio1 {


    //atributos
    int numero;
    int contador=0;
    int operacionPrimo=0;

    public void digiteElNumero (){

        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero:"));

    }

    public  void numeroPrimo (){

        for (int i=1;i<=numero;i++){
            operacionPrimo=numero%i;
            if (operacionPrimo==0){
                contador+=1;
            }
        }

        if  (contador==2){

            JOptionPane.showMessageDialog(null,"El  "+numero+" es primo.");

        }
        else {
            JOptionPane.showMessageDialog(null,"El "+numero+" no es primo.");

        }

    }


}




