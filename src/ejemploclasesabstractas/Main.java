package ejemploclasesabstractas;

import abstracto.domain.*;
import abstracto.domain.FiguraGeometrica;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //creacion objetos
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        FiguraGeometrica circulo = new Circulo("Circulo");

        System.out.println(rectangulo);
        rectangulo.dibujar();

        System.out.println("");
        System.out.println(triangulo);
        triangulo.dibujar();

        System.out.println("");
        System.out.println(circulo);
        circulo.dibujar();
    }
}
