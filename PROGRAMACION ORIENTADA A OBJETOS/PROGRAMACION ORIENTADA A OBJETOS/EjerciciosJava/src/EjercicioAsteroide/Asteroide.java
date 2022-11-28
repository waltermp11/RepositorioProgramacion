package EjercicioAsteroide;

public class Asteroide extends  Objeto{


    private int lesion;

    public Asteroide(int posX, int posY, char direccion, int lesion) {
        super(posX, posY, direccion);
        this.lesion = lesion;
    }

    @Override
    public void irA(int posX, int posY) {
        super.irA(posX, posY);
    }

}
