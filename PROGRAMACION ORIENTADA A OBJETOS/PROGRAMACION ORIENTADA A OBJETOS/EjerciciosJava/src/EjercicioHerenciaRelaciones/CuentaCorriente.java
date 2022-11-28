package EjercicioHerenciaRelaciones;

public class CuentaCorriente extends Cuenta {

    private Double montoInteresado;

    public CuentaCorriente(Double saldo, EjercicioHerenciaRelaciones.Cuenta cuenta, Double montoInteresado) {
        super(saldo, cuenta);
        this.montoInteresado = montoInteresado;
    }

    @Override
    public void extraerEfectivo(double valorAExtraer) {
        if (consultarSaldo()<=valorAExtraer){
            setSaldo(consultarSaldo()+valorAExtraer);

        }
        else {
            setSaldo(consultarSaldo());
        }
    }
}
