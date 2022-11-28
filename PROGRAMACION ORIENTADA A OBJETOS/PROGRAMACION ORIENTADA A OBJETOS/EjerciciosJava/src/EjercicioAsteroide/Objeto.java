package EjercicioAsteroide;

public class Objeto {

    private int posX;
    private int posY;
    private char direccion;


    //metodo constructor
    public Objeto(int posX, int posY, char direccion) {
        this.posX = posX;
        this.posY = posY;
        this.direccion = direccion;
    }

    public  void  irA (int posX, int posY){
        this.posX = posX;
        this.posY = posY;

    }

    //getters
    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public char getDireccion() {
        return direccion;
    }
}
