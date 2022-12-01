package SimulacionExamen;

public class Alumno {
    private String nombre;
    private String apellido;
    private String legajo;

    public Alumno(String nombre, String apellido, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Clase Alumno" +
                "nombre:" + nombre + '\'' +
                ", apellido:" + apellido + '\'' +
                ", legajo:" + legajo + '\'';

    }
}
