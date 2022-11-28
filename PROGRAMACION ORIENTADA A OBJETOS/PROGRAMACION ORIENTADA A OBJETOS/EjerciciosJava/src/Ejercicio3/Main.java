package Ejercicio3;

import java.util.Scanner;

public class Main {
    //aca creamos un metodo, que nos muestre cual es el vehiculo mas barato y de parametro le vamos a pasar el array
    public static int indiceCocheMBarato (Vehiculo coches[]){
        int precio=0;
        int indice=0;


        //accedi al precio de mi coche 1, aca ingrese a mi objeto coche que seria el primero
        precio = coches[0].getPrecio();

        for (int i = 1; i<coches.length;i++){
            if (coches[i].getPrecio()<precio){
                precio = coches[i].getPrecio();
                indice = i;
            }

        }

    return indice;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String modelo, marca;
        int precio=0;
        int cantidadVehiculo,indiceBarato;


        //pido aca la cantidad de vehiculos
        System.out.println("Digite la cantidad de vehiculos:");
        cantidadVehiculo= sc.nextInt();

        // Aca creamos el array, o sea que creamos un objeto por la cantidad de vehiculos que se ingresaron, tenemos n objetos

        Vehiculo /*nombre de mi array */coches[] = new Vehiculo[cantidadVehiculo];

        for (int i=0;i<coches.length;i++){
            //cuando los programas pasan eso agregamos un next line para arreglar el espacio pasa con STRINGs
            sc.nextLine();

            System.out.println(" Digite las caracteristicas del Vehiculo \n "+(i+1)+" :");
            System.out.print(" Marca: ");
            marca = sc.nextLine();
            System.out.print(" Modelo:");
            modelo= sc.nextLine();
            System.out.print("Precio:");
            precio=sc.nextInt();

            coches[i] = new Vehiculo(marca,modelo,precio);


        }


        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("el coche mas barato es :");
        System.out.printf(coches[indiceBarato].mostrarDatos());



    }

}