package EjercicioPractica;

public class Main {
    public static void main(String[] args) {


        Chofer chofer1 = new Chofer("Walter","Montoya",new Auto("XCXC","Mazda","2019"));


        System.out.println("La patende asignada es:"+ chofer1.mostraPatente());
        System.out.println("La potencia del auto es:"+chofer1);


    }
}
