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
public class RaizDec {
     float Raiz;
     
   public RaizDec(float raiz){
       this.Raiz=raiz;
   }

    public float getRaizD(float raiz) {
        float x=1;
        for(int k=1; k<10; k++){
            x=(x+ (raiz/x))/2;
        }
        return x;
    }

    public void setRaizD(float raiz) {
        this.Raiz = raiz;
    }
}
