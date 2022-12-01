package SimulacionExamen;

public class ExamenFinal extends Examen implements Comparable{

    private double notaOral;
    private String descripcionNota;
    private double promedio;



    //constructor

    public ExamenFinal(String titulo, String enunciado, double nota, double notaOral, String descripcionNota) {
        super(titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcionNota = descripcionNota;
    }

    //Metodo promediando ambas notas del estudiante.
    //comparando las notas de examenes finales

    public int compareTo(Object obj) {

        ExamenFinal e2 = (ExamenFinal) obj;
        int respuesta=0;

        if ((notaOral+getNota())/2 > (e2.notaOral + e2.getNota())/2) {
            System.out.println((notaOral+getNota())/2);
            respuesta=1;
        }
        if ((notaOral+getNota())/2 < (e2.notaOral + e2.getNota())/2) respuesta=-1;
        System.out.println((e2.notaOral + e2.getNota())/2);
        return respuesta;
    }

    //getters an setters

    public double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(int notaOral) {
        this.notaOral = notaOral;
    }

    public String getDescripcionNota() {
        return descripcionNota;
    }

    public void setDescripcionNota(String descripcionNota) {
        this.descripcionNota = descripcionNota;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    //metodo toString


    @Override
    public String toString() {
        return super.toString()+
                "notaOral:" + notaOral +
                ", descripcionNota:" + descripcionNota +
                ", promedio:" + promedio;
    }
}
