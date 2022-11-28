package Ejercicio4;

import java.util.Scanner;

public class Main {

    public static int atletaConMenorTiempo(Atleta atletas[]){

        float tiempoInicial =0;
        float tiempoGanador=0;
        int indice =0;
        tiempoInicial=  atletas[0].getTiempoDeCarrera(); //Accedo al primer tiempo de mi participante

        for (int i=1;i<atletas.length;i++){
            if (atletas[i].getTiempoDeCarrera()<tiempoInicial){
                tiempoGanador=atletas[i].getTiempoDeCarrera();
                indice = i;
            }
        }
        return indice;

    }

    public static void main(String[] args) {

        //variables
        String nombre,numero;
        float tiempo=0;
        int cantidadAtletas=0;
        int ganador=0;
        //scanner
        Scanner sc = new Scanner(System.in);

        //Necesito la cantidad de participantes
        System.out.println("Ingrese la cantidad de atletas:");
        cantidadAtletas= sc.nextInt();

        //aca creo el array que va a tener esa cantidad de participantes, que los participantes van hacer mis objetos.
        Atleta atletas /*Nombre array*/ []=  new Atleta [cantidadAtletas];



        for (int i=0; i<atletas.length;i++){
            sc.nextLine();

            System.out.println("VALORES ATLETA\n");
            System.out.println("Numero:");
            numero = sc.nextLine();
            System.out.println("Nombre:");
            nombre = sc.nextLine();
            System.out.println("Tiempo:");
            tiempo= sc.nextFloat();

            //aca cree un objeto en mi clase Atleta por cada vez que yo ingrese todos los datos de un atleta, que seria los mimos del constructor.
            atletas[i]= new Atleta(numero,nombre,tiempo);
        }

        ganador = atletaConMenorTiempo(atletas); // en mi variable ganador le paso el metodo de menor tiempo  con el parametro que seria mi misma array.
        System.out.println("El ganador es: "+atletas[ganador].mostrarDatos());
    }
}
