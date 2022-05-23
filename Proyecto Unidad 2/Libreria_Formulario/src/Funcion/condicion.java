
package Funcion;

/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class condicion {
     String V, F;
     
   public condicion(String v, String f){
       this.V=v;
       this.F=f;
   }

    public String getConjuncion(String v, String f) {
         String condi="";
       
         if(v.equals("V") && f.equals("V")){
            condi= " V ";
            }else{
            condi= " F ";
            }
       
        return condi;
    }

    public void setConjuncion(String v, String f) {
       this.V=v;
       this.F=f;
    }

    public String getDisyuncion(String v, String f) {
         String condi="";
        
        if(v.equals("F") && f.equals("F")){
            condi= " F ";
            }else{
            condi= " V ";
            }
        return condi;
    }

    public void setDisyuncion(String v, String f) {
        this.V=v;
       this.F=f;
    }
    
    public String getBicondicional(String v, String f) {
         String condi="";
        if(v.equals(f)){
            condi= " V ";
        }else{
            condi= " F ";
        }
        return condi;
    }

    public void setBicondicional(String v, String f) {
        this.V=v;
       this.F=f;
    }
    
    
     public String getCondicional(String v, String f) {
         String condi="";
         
        if(v.equals("V") && f.equals("F")){
            condi= " F ";
            }else{
            condi= " V ";
            }
        return condi;
    }

    public void setCondicional(String v, String f) {
        this.V=v;
       this.F=f;
    }

}
