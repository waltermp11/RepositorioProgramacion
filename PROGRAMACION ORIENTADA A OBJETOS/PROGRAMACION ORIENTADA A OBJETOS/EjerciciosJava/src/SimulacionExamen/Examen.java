package SimulacionExamen;

public abstract class  Examen {
    private String titulo;
    private String enunciado;
    private double nota;


    //constructor
    public Examen(String titulo, String enunciado, double nota) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }



    public boolean aprobarExamen (){
        if (nota>=3){
            System.out.println("Aprobo el Examen");
            return true;
        }
        else {
            System.out.println("No aprobo el examen :c");
            return false;
        }

    }

    @Override
    public String toString() {
        return "Examen:" +
                "titulo:" + titulo + '\'' +
                ", enunciado:" + enunciado + '\'' +
                ", nota:" + nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
