package Empresa;

public class Empleado {

    private String nombre;
    private String apellido;
    private String dni;


//Metodo constructor


    public Empleado(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    //Metodos

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    //
    public void trabajar() {
        System.out.println("El empleado " + nombre + " " + apellido + " esta trabajando.");
    }

    public void descansar() {
        System.out.println("El empleado " + nombre + " " + apellido + " esta descansando.");


    }


}