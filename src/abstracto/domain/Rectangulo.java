package abstracto.domain;

public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }

    public void dibujar(){
        //Comportamiento de la subclase
        System.out.println("Aqui deberia dibujar un: " + this.getClass().getSimpleName());
    }
}
