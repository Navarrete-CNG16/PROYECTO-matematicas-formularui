
package Funcion;

/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class Raiz {
     int Raiz;
     
   public Raiz(int raiz){
       this.Raiz=raiz;
   }

    public double getRaiz(int raiz) {
        double x=1.0;
        for(int k=1; k<10; k++){
            x=(x+ (raiz/x))/2;
        }
        return x;
    }

    public void setRaiz(int raiz) {
        this.Raiz = raiz;
    }
}
