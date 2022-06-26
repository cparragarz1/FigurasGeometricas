
package figurasgeometricas;

import clases.Circulo;
import clases.Hexagono;
import clases.TrianguloEquilatero;
import clases.Rectangulo;

public class Figurasgeometricas {
    public static void main(String[] args) {
        Circulo miCirculo= new Circulo (3) ;
        miCirculo.setDiametro(1.5); 
        System.out.println("Área del circulo:"+miCirculo.calculoArea());
     System.out.println("Perimetro del circulo:"+miCirculo.calculoPerimetro());
     TrianguloEquilatero miTrianguloEquilatero=new TrianguloEquilatero(2,4 , 5, 6);
      System.out.println("Área del triangulo equilatero:"+miTrianguloEquilatero.calculoArea());
     System.out.println("Perimetro de un triagulo equilatero:"+miTrianguloEquilatero.calculoPerimetro());
     Rectangulo miRectangulo= new Rectangulo(4, 3);
     System.out.println("Área del rectangulo es:"+miRectangulo.calculoArea());
     System.out.println("Perimetro del rectangulo es:"+miRectangulo.calculoPerimetro());
     Hexagono miHexagono=new Hexagono(5);
      System.out.println("Perimetro del hexagono es:"+miHexagono.calculoPerimetro());
     System.out.println("Area del hexagono es:"+miHexagono.calculoArea());
     
     
}
}
