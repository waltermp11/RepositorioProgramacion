package SimulacionExamen;

public class Main {

    public static void main(String[] args) {

        //Alumno 1
        Alumno alumno1 = new Alumno("Walter","Montoya","1007017276");
        ExamenFinal e1 = new ExamenFinal("Examen biofisica","ultimo examen de la materia donde se evaluo todo lo visto en el semestre",4,5,"Estubo bien");

        System.out.println(alumno1.toString()+e1);
        ExamenFinal e2 = new ExamenFinal("Examen biofisica","ultimo examen de la materia donde se evaluo todo lo visto en el semestre",2,2,"Estubo regular");

        //comparando ambos objetos

       if (e1.compareTo(e2)>0) {
            System.out.println("Saco mas nota el examen final 1: " +e1.toString()+(e1.getNotaOral()+ e1.getNota())/2);
        } else if (e1.compareTo(e2) <0 ) {
            System.out.println("Saco mas nota el examen final 2");
        }
        else {
            System.out.println("Sacaron la misma nota en ambos examenes finales");

        }




        //aplicando si esl estudiante gano la materia

        ExamenParcial examenParcial1 = new ExamenParcial("Final de Calculo","No hay enunciado",5,3,4);


        examenParcial1.recuperarExamen();
        examenParcial1.aprobarExamen();
    }

}
