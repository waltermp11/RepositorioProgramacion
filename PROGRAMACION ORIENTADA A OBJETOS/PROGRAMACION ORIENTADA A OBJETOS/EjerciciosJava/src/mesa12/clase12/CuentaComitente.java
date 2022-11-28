package mesa12_equipo3.clase12;

public class CuentaComitente extends Cuenta {

    private String cnv;

    @Override
    public void depositar(double monto) {
        setSaldo(informarSaldo() + monto*0.99);
        System.out.println("Su deposito se realizo correctamente, su saldo actualizado es de: $" + informarSaldo());

    }

    @Override
    public void extraer(double monto) {
        double limite = monto/2;
        if(monto <= limite){
            setSaldo(informarSaldo() - monto);
        }else{
            System.out.println("El valor a retirar: $" + monto + " supera el 50% de su saldo actual: $" + informarSaldo() + ", si desea retirar ese valor, por favor haga uso de su CNV" );
        }
    }

    public void extraer(double monto, String cnv) {
        setSaldo(informarSaldo() - monto);
    }

}
