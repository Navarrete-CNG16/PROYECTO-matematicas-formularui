//MAIN para evaluar el funcionamiento de mis Librerias
package formulario_tau2;

import Funcion.Potencia;
import Funcion.Raiz;
import Funcion.Factorial;
import Funcion.ValorAbs;
import Funcion.Pi;
import Funcion.condicion;
import Funcion.desigualda;
import Funcion.PotenciaDecimal;
import Funcion.RaizDec;
/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class Formulario_TAU2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int e = 0,m = 0,n = 0, EE=6;
        int a = 9,b=3,c=2,f=5;
        int A= 2,B= 3,C=4;
        float v = -12, dec=5;
        
        double PO= 0.35;
        String ve="V",fa="V";
        Raiz RZ= new Raiz(e);
        Potencia POT= new Potencia(m,n);
        Factorial FAC= new Factorial(e);
        ValorAbs Vll= new ValorAbs(e);
        Pi pi= new Pi();
        condicion CO= new condicion(ve,fa);
        desigualda DESI= new desigualda(A,B,C);
        
        PotenciaDecimal POTD= new PotenciaDecimal(EE,PO);
        int treinta=31;
        double res = treinta%2;
        System.out.println("Reciduo: "+ res);
        
        POTD.setPotenciaDecimal(EE,PO);
        System.out.println("Potencia de "+ PO + " es: " +POTD.getPotenciaDecimal(EE,PO));
        
        POT.setPotencia(b,c);

        System.out.println("Potencia de "+ b+ " es: " +POT.getPotencia(b,c));
        
        RZ.setRaiz(a);
        System.out.println("Raiz de "+a+" es "+RZ.getRaiz(a));
        
        FAC.setFactorial(f);
        System.out.println("Factoreal de "+f+" es "+ FAC.getFactorial(f));
        
        Vll.setValor(v);
        System.out.println("Valor Absoluto de "+v+" es "+ Vll.getValor(v));
        
        System.out.println("Multiplicacion es: "+ pi.getPii()+" *  "+ f +" = " + (f*pi.getPii()));
        
        CO.setConjuncion(ve, fa);
        System.out.println( ve +" Y "+ fa +" es: "+ CO.getConjuncion(ve, fa));
        
        DESI.setDes1(A,B,C);
        System.out.println(DESI.getDes1(A,B,C));
        
        DESI.setDes2(A,B,C);
        System.out.println(DESI.getDes2(A,B,C));
        
        DESI.setDes3(A,B,C);
        System.out.println(DESI.getDes3(A,B,C));
        
        DESI.setDes4(A,B,C);
        System.out.println(DESI.getDes4(A,B,C));
    }
    
}
