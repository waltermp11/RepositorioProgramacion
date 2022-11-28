package com.clases.clase12;

public class Main {
    public static void main(String[] args) {

        /*CajaAhorro ca = new CajaAhorro();
        ca.setSaldo(100);
        ca.cobrarIntereses();
        System.out.println(ca.informarSaldo());

        Cuenta ca2 = new CajaAhorro();
        ((CajaAhorro)ca2).cobrarIntereses();

        Cuenta cc = new CuentaCorriente();
        cc.setSaldo(2000);
        cc.extraer(1500);
        System.out.println(cc.informarSaldo());
        ((CuentaCorriente)cc).setDescubiertoPermitido(1000);
        cc.extraer(2000);
        System.out.println(cc.informarSaldo());*/

        Cuenta cco = new CuentaComitente();
        cco.setSaldo(1000);
        ((CuentaComitente)cco).depositar(100);
        cco.extraer(700);
        ((CuentaComitente) cco).extraer(700, "soy un CNV");
        System.out.println(cco.informarSaldo());


    }
}
