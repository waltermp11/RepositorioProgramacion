package EjercicioAsteroide;

public class Nave extends Objeto {

    private double velocidad;
    private int vida;

    public Nave(int posX, int posY, char direccion, double velocidad, int vida) {
        super(posX, posY, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    @Override
    public void irA(int posX, int posY) {
        super.irA(posX, posY);
    }

    public void girar (char direccion){
        direccion=getDireccion();

    }

    public void restarVida (int valor){
        vida=vida-valor;
    }
}
