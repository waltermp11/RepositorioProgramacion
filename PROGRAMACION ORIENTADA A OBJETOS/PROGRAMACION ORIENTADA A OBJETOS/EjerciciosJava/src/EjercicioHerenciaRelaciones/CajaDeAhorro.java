package EjercicioHerenciaRelaciones;

public class CajaDeAhorro extends Cuenta {

    private double tasaInteres;
    //metodo constructor

    public CajaDeAhorro(Double saldo, EjercicioHerenciaRelaciones.Cuenta cuenta, double tasaInteres) {
        super(saldo, cuenta);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void extraerEfectivo(double valorAExtraer) {
        if (consultarSaldo()>=valorAExtraer){
            setSaldo(consultarSaldo()-valorAExtraer);
        }
        else {
            System.out.println("Fondos insuficientes"+consultarSaldo());
        }

    }

    public double cobrarInteres (double tasaInteres){
        double valorCobroInteres = tasaInteres*consultarSaldo();
        return valorCobroInteres;
    }

}
