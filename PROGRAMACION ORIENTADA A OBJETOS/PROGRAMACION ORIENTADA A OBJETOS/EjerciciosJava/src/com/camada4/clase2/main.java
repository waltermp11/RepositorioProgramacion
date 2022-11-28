package com.camada4.clase2;


import java.util.Scanner;


public class main {

    public static void main(String[] args) {

        System.out.println("Ejercicio 1");
        Scanner scanner=new Scanner(System.in);
        System.out.println("ingres tu nombre: ");
        String nombre= scanner.nextLine();
        System.out.println("Ingresa tu apellido:");
        String apellido= scanner.nextLine();
        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();

       /* char inicialNombre = nombre.charAt(0);
        char inicialApellido= apellido.charAt(0);
        */
        String inicialNombre=String.valueOf(nombre.charAt(0));
        String inicialApellido= Character.toString(apellido.charAt(0));

        System.out.println("Las iniciales de tu nombre son:"+inicialNombre+inicialApellido);
       // System.out.println("Las iniciales de tu nombre son con diferencia de concatenacion: "+.concat(inicialNombre,inicialApellido));


        System.out.println("Ingresa tu dia de nacimiento");
        int diaNac = scanner.nextInt();
        System.out.println("Ingresa tu mes de nacimiento");
        int mesNac= scanner.nextInt();
        System.out.println("Ingresa tu a;o de nacimiento");
        int anioNac=scanner.nextInt();

        System.out.println(mostrarFechaNac( diaNac, mesNac,  anioNac));
    }


    //aca es como creamos una funcion en java
    static String mostrarFechaNac(int dia, int mes, int anio){
        //Los parametros no tiene que ser iguales a las variables, tiene que ser descriptivos.

       String fechaNac= dia+"/"+mes+"/"+anio;

        return fechaNac;
    }

}
