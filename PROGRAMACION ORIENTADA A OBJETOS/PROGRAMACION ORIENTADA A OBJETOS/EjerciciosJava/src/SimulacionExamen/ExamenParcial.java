package SimulacionExamen;

public class ExamenParcial extends Examen {

    private int numeroUnidad;
    private int numeroReintentos;

    //constructor

    public ExamenParcial(String titulo, String enunciado, int nota, int numeroUnidad, int numeroReintentos) {
        super(titulo, enunciado, nota);
        this.numeroUnidad = numeroUnidad;
        this.numeroReintentos = numeroReintentos;
    }


    //metodo para saber si se puede recuperar el examen

    public boolean recuperarExamen(){

        if (numeroUnidad<=3 && numeroReintentos<=3)  {
            System.out.println("puedes recuperar y tienes 3 intentos. ");
            return true;
        }
        if (numeroUnidad>3 && numeroReintentos<=2) {
            System.out.println("puedes recuperar y tienes 2 intentos.");
            return true;
        }
        System.out.println("Paila, no puede recuperar. :c");
        return false;

        }




    //Metodo toString


    @Override
    public String toString() {
        return super.toString()+
                "ExamenParcial " +
                "numeroUnidad:" + numeroUnidad +
                ", numeroReintentos:" + numeroReintentos;
    }
}
