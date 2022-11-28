package clase12;

public class CajaAhorro extends Cuenta {

    public static final double INTERES_CAJA_AHORRO = 1.2;


    //sobreescritura de método abstracto del padre
    @Override
    public void extraer(double monto) {
        if (informarSaldo() >= monto)
            setSaldo(informarSaldo() - monto);
    }

    //sobreescribir metodo no abstracto depositar para que no se permitan depositos superiores a $600.000

    @Override
    public void depositar(double monto) {
        if(monto <= 600000){
            super.depositar(monto);
        } else {
            System.out.println("Los depositos superiores a $600000 deben hacerse por linea de cajas.");
        }


    }

    public void cobrarIntereses() {
        //no es necesario que este escrito CajaAhorro.INTERES_CAJA_AHORRO ya que es un atributo propio
        //setSaldo(informarSaldo()+(informarSaldo()*INTERES))
        setSaldo(informarSaldo() * CajaAhorro.INTERES_CAJA_AHORRO);

    }
}
