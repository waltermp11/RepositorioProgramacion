package EjercicioHerenciaRelaciones;

public class CuentaCorriente extends Cuenta {

    private double montoInteresado;

    public CuentaCorriente (double saldo, EjercicioHerenciaRelaciones.Cuenta cuenta, double montoInteresado) {
        super(saldo);
        this.montoInteresado = montoInteresado;
    }

    @Override
    public double depositar(double valorADepositar) {
        return 0;
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
