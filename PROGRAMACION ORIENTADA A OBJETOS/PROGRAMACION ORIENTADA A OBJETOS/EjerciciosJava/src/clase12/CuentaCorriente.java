package clase12;

public class CuentaCorriente extends Cuenta {

    private double descubiertoPermitido;

    public void setDescubiertoPermitido(double descubiertoPermitido) {
        this.descubiertoPermitido = descubiertoPermitido;
    }

    //sobreescritura de método abstracto del padre

    @Override
    public void extraer(double monto) {
        if ((informarSaldo() + descubiertoPermitido) >= monto) {
            if (informarSaldo() >= monto) {
                setSaldo(informarSaldo() - monto);
            } else {
                descubiertoPermitido -= monto - informarSaldo();
                setSaldo(0);
            }
        }
    }
}
