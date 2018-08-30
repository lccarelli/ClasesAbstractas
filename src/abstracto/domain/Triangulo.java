package abstracto.domain;

public class Triangulo extends FiguraGeometrica {

    public Triangulo(String tipoFigura){
        super(tipoFigura);
    }

    public void dibujar(){
        //Comportamiento de la subclase
        System.out.println("Aqui deberia dibujar un: " + this.getClass().getSimpleName());
    }
}
