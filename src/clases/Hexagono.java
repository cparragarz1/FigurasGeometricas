
package clases;


public class Hexagono extends Figura{
    
private double lado;
private double apotema;

    public Hexagono(double apotema) {
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    

    @Override
    public double calculoPerimetro () {
         
        double lado = 0;
    double hexagonoPerimetro = 6*lado;
        return hexagonoPerimetro;
    }

    @Override
    public double calculoArea () {
        
        double apotema=0;
   double hexagonoPerimetro=0;
        double hexagonoArea=((hexagonoPerimetro*apotema)/2);
        return hexagonoArea;
    }
    
}
