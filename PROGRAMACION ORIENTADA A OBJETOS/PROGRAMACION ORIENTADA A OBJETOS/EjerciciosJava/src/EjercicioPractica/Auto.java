package EjercicioPractica;

public class Auto {
    private String patente;
    private String marca;
    private String modelo;
    private Motor motor;

    public Auto(String patente, String marca, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        motor = new Motor();
    }
//getters
        //get patente
    public String getPatente() {
        return patente;
    }

    public  String mostrarMotor(){
        return motor.getPotencia();
    }
}
