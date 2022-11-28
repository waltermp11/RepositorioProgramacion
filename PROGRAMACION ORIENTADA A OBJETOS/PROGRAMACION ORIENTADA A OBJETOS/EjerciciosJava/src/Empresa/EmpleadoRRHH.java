package Empresa;

public class EmpleadoRRHH  extends  Empleado{

    private String altasLogradas;

    public EmpleadoRRHH(String nombre, String apellido, String dni, String altasLogradas) {
        super(nombre, apellido, dni);
        this.altasLogradas = altasLogradas;

    }

    //metodos

    @Override
    public void trabajar() {
        super.trabajar();
        System.out.println("Teniendo estas altas logradas: "+altasLogradas);
    }
}
