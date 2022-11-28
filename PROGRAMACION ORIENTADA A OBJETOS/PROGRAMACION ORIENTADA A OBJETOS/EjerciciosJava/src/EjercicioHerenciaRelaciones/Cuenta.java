package EjercicioHerenciaRelaciones;

public  abstract class  Cuenta {

    private Double saldo;
    private Cuenta Cuenta;

    public Cuenta(Double saldo, EjercicioHerenciaRelaciones.Cuenta cuenta) {
        this.saldo = saldo;
        Cuenta = cuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public double depositar (double valorADepositar){
        saldo=saldo+ valorADepositar;
        return saldo;
    }

    public   abstract void extraerEfectivo (double valorAExtraer);



    public double consultarSaldo (){
        return getSaldo();
    }

}
