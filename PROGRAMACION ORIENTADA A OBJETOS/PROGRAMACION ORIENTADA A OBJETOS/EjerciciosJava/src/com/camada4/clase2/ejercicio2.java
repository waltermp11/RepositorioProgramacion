package com.camada4.clase2;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class ejercicio2 {

    /*Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
unNumeroC)*/

    public static void main(String[] args) {

       int  numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
       int  numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
       int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero:"));
       String numero4 = String.valueOf(JOptionPane.showInputDialog("Ingrese nombre: "));
       JOptionPane.showMessageDialog(null,numero4);
        System.out.println(numeroMaximo(numero1,numero2,numero3));

    }


    static int numeroMaximo(int num1, int num2, int num3){

        if (num1==num2 && num1==num3){

            JOptionPane.showMessageDialog(null,"Los numeros son iguales");
        } else if (num1 > num2 && num1>num3) {

            JOptionPane.showMessageDialog(null,"El "+num2+"  es el mayor");

        } else if (num2>num1 && num2>num3) {
            JOptionPane.showMessageDialog(null,"El"+num2+"  es el mayor");

        }

        else {
            JOptionPane.showMessageDialog(null,"El"+num3+"  es el mayor");
        }


    return 0;
    }
}
