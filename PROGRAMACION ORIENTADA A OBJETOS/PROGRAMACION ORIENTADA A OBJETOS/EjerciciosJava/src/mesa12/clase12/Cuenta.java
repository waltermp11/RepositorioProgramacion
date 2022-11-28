package mesa12_equipo3.clase12;

public abstract class Cuenta {
    private double saldo;

    //metodo a sobrecargar - recibiendo como parametro ademas del monto, un String moneda que en caso de ser "dolar" se debe multiplicar el monto por 95 y sumarlo al saldo
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Su deposito se realizo correctamente, su saldo actualizado es de: $" + saldo);
    }

    public void depositar(double monto, String moneda){
        if(moneda.equalsIgnoreCase("dolar")){
            saldo += monto * 95;
        }
        //saldo += monto;
        depositar(monto);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double informarSaldo() {
        return saldo;
    }

    public abstract void extraer(double monto);
}
