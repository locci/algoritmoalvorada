
package concorrente;

import static concorrente.Main.lis;
import java.util.ArrayList;

/**
 *
 * @author alexandre
 */


public class MainSeq {
    
    static ArrayList<Integer> lis = new ArrayList<Integer>(); 
        
    private final static int NUM = 10000000;
    
     public static void main(String[] args) {
                
                int soma = 0;
                MainSeq.incList();
                
                int cont = 0;
                
                for (int i = 0; i < MainSeq.lis.size(); i++) {
                    
                    if(MainSeq.lis.get(i) < 100){
                        cont++;
                    }
             
         }
                
                System.out.println(cont);
               
                
                              
                
    }
     
      public static void incList() {
        
        int value = 0;
        
        for(int i=0; i < MainSeq.NUM; i++) {
            
            value = (int)(Math.random() * 1000);
            MainSeq.lis.add(value);
           
            
        }
                
    }
    
}
