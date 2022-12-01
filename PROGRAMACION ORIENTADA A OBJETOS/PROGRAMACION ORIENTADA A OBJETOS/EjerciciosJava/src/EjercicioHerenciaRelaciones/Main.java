package EjercicioHerenciaRelaciones;

public class Main {
    public static void main(String[] args) {

       /* CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(1000,1.4);
        System.out.println(cajaDeAhorro1.consultarSaldo()) ;
        cajaDeAhorro1.extraerEfectivo(1200);
        */



        // otro objeto

        CajaDeAhorro cajaDeAhorro2 = new CajaDeAhorro(10000,1.3);
        cajaDeAhorro2.setSaldo(100000);
        cajaDeAhorro2.depositar(50000);




    }




}
