package com.camada4.Calculadora;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        Calculadora operacion = new Calculadora();

        //el set es para modificar el valor

        //operacion.setNumero1(9);
        //operacion.setNumero2(3);

        //el get seria para obtener
        JOptionPane.showMessageDialog(null,operacion.getNumero1());
        JOptionPane.showMessageDialog(null,operacion.getNumero2());


        // Se que me piden dos parametros, pero quiero que esos dos parametros sean los que se recibieron en el metodo de leer numeros
        // operacion.pedirNumeros();

         JOptionPane.showMessageDialog(null, "La suma de los dos numeros es: "+operacion.sumar());
         operacion.resta();
         operacion.multiplicacion();
         operacion.division();




    }
}
