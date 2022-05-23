
package Funcion;

/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class Factorial {
     int Factorial;
     
   public Factorial(int factorial){
       this.Factorial=factorial;
   }

    public int getFactorial(int factorial) {
        int f=1;
        while (factorial!=0){
            f= f*factorial;
            factorial--;
        }
        return f;
    }

    public void setFactorial(int Factorial) {
        this.Factorial = Factorial;
    }
         
}
