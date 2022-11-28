package Ejercicio4;

/*construir un programa para una competencia de atletismo, el programa debe gestionar una serie de atletas caract erizados por su numero de atleta, nombre y tiempo de carrera, al final el programa debe mostrar los datos del atleta ganador de la carrera.
*/
public class Atleta {

    private String numeroDeAtleta;
    private  String nombreDeAtleta;
    private float tiempoDeCarrera;


    public Atleta(String numeroDeAtleta, String nombreDeAtleta, float tiempoDeCarrera) {
        this.numeroDeAtleta = numeroDeAtleta;
        this.nombreDeAtleta = nombreDeAtleta;
        this.tiempoDeCarrera = tiempoDeCarrera;
    }

    public float getTiempoDeCarrera() {
        return tiempoDeCarrera;
    }

    public String mostrarDatos (){

        return "numero:"+numeroDeAtleta+"\n nombre:"+nombreDeAtleta+"\n tiempo:"+tiempoDeCarrera;
    }
}
