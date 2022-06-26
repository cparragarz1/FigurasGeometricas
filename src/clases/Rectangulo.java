
package clases;
public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
   
    public double calculoArea() {
       double base=0;
         double altura=0;
         double rectanguloArea=(this.base*this.altura);
         return rectanguloArea;
    }
     @Override
      public double calculoPerimetro() {
          double rectanguloPerimetro= ((2*this.base)*(2*this.altura));
        return rectanguloPerimetro;
      }
}

