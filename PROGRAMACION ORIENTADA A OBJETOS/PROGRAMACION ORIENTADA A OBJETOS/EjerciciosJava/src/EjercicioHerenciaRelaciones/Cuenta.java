package EjercicioHerenciaRelaciones;

public  abstract class  Cuenta {

    private double saldo;


    public Cuenta(double saldo) {
        this.saldo = saldo;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double  saldo) {

        this.saldo = saldo;
    }

    public abstract void  depositar (double valorADepositar);

    public   abstract void extraerEfectivo (double valorAExtraer);



    public double consultarSaldo (){

        return getSaldo()
                ;
    }

}
