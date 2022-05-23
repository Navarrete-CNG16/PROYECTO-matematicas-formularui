

package Funcion;

/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class ValorAbs {
    float valor;
     
   public ValorAbs(float Valor){
       this.valor=Valor;
   }

    public float getValor(float valorabs) {
        float valorabsoluto;
        if (valorabs >= 0) {
            valorabsoluto = valorabs;
        } else {
            valorabsoluto = valorabs * -1;
          }
        
        return valorabsoluto;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
