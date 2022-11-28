package Empresa;

public class EmpleadoMarketing extends Empleado{

    private String area;

    //Metodo Constructor
    public EmpleadoMarketing(String nombre, String apellido, String dni, String area) {
        super(nombre, apellido, dni);
        this.area = area;
    }

    @Override
    public void trabajar() {
        super.trabajar();
    }

    public void trabajar (int horasExtras){
        System.out.println("El trabajador "+getNombre()+"a estado trabajando esta cantidad de horas extras:"+horasExtras);

    }


}
