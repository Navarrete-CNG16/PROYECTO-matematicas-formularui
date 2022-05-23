
package Funcion;

/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class desigualda {
    int A, B, C;
     
   public desigualda(int a, int b, int c){
       this.A=a;
       this.B=b;
       this.C=c;
   }
    public String getDes1(int a, int b, int c) {
         String condi="";
       
         if( a<b && b<c){
               condi= " A < C = "+ a +" < "+ c; 
            }
         else{
             condi= " A ò B son mayores"; 
         }
       
        return condi;
    }

    public void setDes1(int a, int b, int c) {
       this.A=a;
       this.B=b;
       this.C=c;
    }
    
     public String getDes2(int a, int b, int c) {
         String condi="";
       
         if( a<b){
               condi= " A+C < B+C = "+ (a+c) +" < "+ (b+c); 
            }
         else{
             condi= " A es mayor que B"; 
         }
       
        return condi;
    }

    public void setDes2(int a, int b, int c) {
       this.A=a;
       this.B=b;
       this.C=c;
    }
    
    public String getDes3(int a, int b, int c) {
         String condi="";
       
         if( a<b && c>0){
               condi= " AC < BC = "+ (a*c) +" < "+ (b*c); 
            }
         else{
             condi= " A es mayor que B ò C<0"; 
         }
       
        return condi;
    }

    public void setDes3(int a, int b, int c) {
       this.A=a;
       this.B=b;
       this.C=c;
    }
    
     public String getDes4(int a, int b, int c) {
         String condi="";
       
         if( a<b && c<0){
               condi= " AC > BC = "+ (a*c) +" < "+ (b*c); 
            }
         else{
             condi= " A es mayor que B ò C>0"; 
         }
       
        return condi;
    }

    public void setDes4(int a, int b, int c) {
       this.A=a;
       this.B=b;
       this.C=c;
    }
}
