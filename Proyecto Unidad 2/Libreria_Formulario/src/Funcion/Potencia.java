
package Funcion;

/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class Potencia {
     int Potencia;
     int Numero;
   public Potencia(int potencia, int numero){
       this.Potencia=potencia;
       this.Numero=numero;
   }

    public int getPotencia(int n, int m) {
       int result= 1;
        for(int i=0; i<n; i++){
             result= result * m;
        }
        return result;
    }

    public void setPotencia(int n, int m) {
        this.Potencia=n;
       this.Numero=m;
    }
}
