
package ep2resposta;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexandre
 */


public class Ep2Input {
    
    public static final int VALORDOSEELEMENTOS = 1000;
    public static final int VALORREPETICAO = 500;
    public static final int VALORROP = 5;
    public static final int VALORRODADA = 1000;
    
    
    public static void main(String[] args) {
        
        File inp = new File("entrada");
        int line = 0;
        int conj1 = (int)(Math.random()*VALORREPETICAO )+1;
         int conj2 =(int) (Math.random()*VALORREPETICAO )+ 1;
         int ope   = (int) (Math.random()*VALORROP  ) + 1;  
         int numeroDeFuncoes = (int)(Math.random()*VALORRODADA + 1); 
         ArrayList<String> arrStrConj1 = new ArrayList<String>();
         ArrayList<String> arrStrConj2 = new ArrayList<String>();
         String conjuntosQueSeraoImprimidos;
         
        try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(inp));
            Ep2Input ep = new Ep2Input();
            System.out.println(numeroDeFuncoes);
            System.out.println(ope);
            while(numeroDeFuncoes > 0){
                 
                System.out.println("interacao numero " + numeroDeFuncoes);                
                System.out.println("operacao " + ope);
                
                  arrStrConj1 = ep.constroiConjunto(conj1);
                  arrStrConj2 = ep.constroiConjunto(conj2);       
                        
            if(ope == 1) {
                //uniao
                conjuntosQueSeraoImprimidos = ep.construirString(arrStrConj1, arrStrConj2, "u");
            } else {
                
                if((ope==2)){
                  //inter
                    conjuntosQueSeraoImprimidos = ep.construirString(arrStrConj1, arrStrConj2, "i");
                } else {
                    if((ope == 3)){
                         //sub
                        conjuntosQueSeraoImprimidos = ep.construirString(arrStrConj1, arrStrConj2, "s");
                    } else {
                         conjuntosQueSeraoImprimidos = ep.construirString(arrStrConj1, arrStrConj2, "");
                    }         
                   
                    
                }
            }
            
            bw.write(conjuntosQueSeraoImprimidos+"\n");
            ope   =  (int)(Math.random()*5) +1 ;  
             arrStrConj1 = null;
             arrStrConj1 = null;
             conjuntosQueSeraoImprimidos = "";    
             numeroDeFuncoes--;           
                
            }
                   
            bw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Ep2Input.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
    }
    
    public ArrayList<String> constroiConjunto(int conj1){
        
         int num = 0;
         ArrayList<String> arrStrConj = new ArrayList<String>();
         
        for(int i=0; i < conj1; i++){
                
                num = (int)(Math.random()*VALORDOSEELEMENTOS) + 1;
                
                if(!arrStrConj.contains(String.valueOf(num))) {
                    
                    arrStrConj.add(String.valueOf(num));
                    
                }
                
                
            }
        
        return arrStrConj;
    }
    
    public String construirString(ArrayList<String> arr1, ArrayList<String> arr2, String str) {
        
        String out = "{";
        
        if(!str.equals("")){
            
         for(int i = 0; i < arr1.size(); i++){
            
            if(i == 0) {
                out = out + arr1.get(i);
            } else {
                out = out + "," +arr1.get(i);
            }    
            
        }
        
        out = out + "}" + " " +str + " " + "{";
        
        for(int i = 0; i < arr2.size(); i++){
            
            if(i == 0) {
                out = out + arr2.get(i);
            } else {
                out = out + "," +arr2.get(i);
            }    
            
        }
        
         out = out + "}";
        
        }  else {
            
            for(int i = 0; i < arr1.size(); i++){
            
               if(i == 0) {
                out = out + arr1.get(i);
              } else {
                out = out + "," +arr1.get(i);
              }    
            
            }
             out = out + "}";
            
        }
        
        return out;
        
    }
    
}
