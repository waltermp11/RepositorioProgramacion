package com.camada4.clase3;

import javax.swing.*;

public class numerosPrimos {

    public static void main(String[] args) {


        int num=0;



        int n= Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));

        while(n>0){

            num=num+1;
           int   x=1;
            int contador=0;

                while (x<=num){

                    if (num%x == 0){
                        contador++;
                    }
                    x++;
                }
        if(contador==2){
            JOptionPane.showMessageDialog(null,"numero primo:"+num);
        n=n-1;
        }
        }
    }
}
