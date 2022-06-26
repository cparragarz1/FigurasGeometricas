
package clases;

public class Circulo extends Figura{
private double radio;
private double diametro;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double calculoArea() {
        double circuloArea=NO_PI*(this.radio*this.radio);
        
        double circuloArea2=NO_PI*Math.pow(radio,2);
        return circuloArea2;
    }

    @Override
    public double calculoPerimetro() {
        double resultDiametro=0;
        if(this.diametro>0){
            resultDiametro=NO_PI*this.diametro;
        }
        else { resultDiametro=-1;
        }
        return resultDiametro;
    } 
}
        
    

   
    
    
