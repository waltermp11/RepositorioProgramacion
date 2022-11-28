package EjercicioHerenciaRelaciones;

public class CajaDeAhorro extends Cuenta {

    private double tasaInteres;
    //metodo constructor


    public CajaDeAhorro(double saldo, double tasaInteres) {
        super(saldo);
        this.tasaInteres = tasaInteres;
    }

    public void extraerEfectivo(double valorAExtraer) {
        if (consultarSaldo()>=valorAExtraer){
            setSaldo(consultarSaldo()-valorAExtraer);
            System.out.println("su saldo actual es:"+consultarSaldo());
        }
        else {
            System.out.println("Fondos insuficientes " +
                    "\n Su saldo actual es ="+consultarSaldo()+
                    "\n lo que desea extraer = "+valorAExtraer);

        }

    }

    public double cobrarInteres (double tasaInteres){
        double valorCobroInteres = tasaInteres*consultarSaldo();
        return valorCobroInteres;
    }

    @Override
    public double depositar(double valorADepositar) {
            if(valorADepositar >=60000){
                System.out.println("Su cuenta no puede almacenar esa cantidad de deposito.");
            }
            else    {
                setSaldo(getSaldo()+valorADepositar);
                System.out.println("Su saldo actual es = "+consultarSaldo());
            }



        return valorADepositar;
    }
}
