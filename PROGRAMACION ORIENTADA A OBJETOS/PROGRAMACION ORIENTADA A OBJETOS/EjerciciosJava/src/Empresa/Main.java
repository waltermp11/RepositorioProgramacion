package Empresa;

public class Main {
    public static void main(String[] args) {

        //empleado 1 marketing
        EmpleadoMarketing  empleadoMarketing1 = new EmpleadoMarketing("Walter","Montoya","1007017276","Area 1");

        //Empleado en produccion\
        EmpleadoProduccion empleadoProduccion1= new EmpleadoProduccion("Esteban","giraldo","123123",780);


        empleadoMarketing1.trabajar();
        empleadoMarketing1.trabajar(10);
    }
}
