package EjercicioHerenciaRelaciones;

public class CuentaCorriente extends Cuenta {

    private double montoInteresado;

    public CuentaCorriente (double saldo, EjercicioHerenciaRelaciones.Cuenta cuenta, double montoInteresado) {
        super(saldo);
        this.montoInteresado = montoInteresado;
    }

    @Override
    public void depositar(double valorADepositar) {
        if (valorADepositar<=600000){
            setSaldo(consultarSaldo()+valorADepositar);
            System.out.println("Su saldo actual es : "+consultarSaldo());
        }
        else {
            System.out.println("No se puede depositar esa cantidad de dinero en su cuenta  = "+valorADepositar);
        }

    }

    public void extraerEfectivo(double valorAExtraer) {
        if (consultarSaldo()<=valorAExtraer){
            setSaldo(consultarSaldo()+valorAExtraer);

        }
        else {
            setSaldo(consultarSaldo());
        }
    }
}
