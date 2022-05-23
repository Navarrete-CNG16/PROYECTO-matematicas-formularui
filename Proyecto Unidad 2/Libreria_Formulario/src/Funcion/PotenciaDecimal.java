/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcion;

/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class PotenciaDecimal {
     int Potencia;
     double Numero;
   public PotenciaDecimal(int potencia, double numero){
       this.Potencia=potencia;
       this.Numero=numero;
   }

    public double getPotenciaDecimal(int n, double m) {
       double result= 1;
        for(int i=0; i<n; i++){
             result= result * m;
        }
        return result;
    }

    public void setPotenciaDecimal(int n, double m) {
        this.Potencia=n;
       this.Numero=m;
    }
}
