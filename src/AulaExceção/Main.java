
package AulaExceção;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexandre
 */


public class Main {
    
    public static void main(String[] args) {
        
        ExcecaoExemplo ee = new ExcecaoExemplo();
        
        System.out.println(ee.lancarExcecaoAvisando(10, 10));//não força tratamento fica a cargo do progrmador.
        
        System.out.println(ee.lancarVariasExcecaoAvisando(10, 10));
        
        try {
            
            ee.lancarForcarTratamento();//não tenho escolha.
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
      
}

class ExcecaoExemplo {
    
    public double lancarExcecaoAvisando(int numDeno, int numCoe) throws ArithmeticException{
        
        return numDeno/numCoe;
        
    }
    
    public double lancarVariasExcecaoAvisando(int numDeno, int numCoe) throws ArithmeticException, ArrayIndexOutOfBoundsException{
        
        int[] num = new int[10];
        
        num[numDeno] = num[numCoe];
        
        return numDeno/numCoe;
        
    }
    
    public void lancarForcarTratamento() throws FileNotFoundException{
        
        Scanner sc = new Scanner(new File("oi"));
        
        
    }
    
     public double lancarExcecaoIntencionalmente(int numDeno, int numCoe) {
        
        if (numCoe == 0) {
            throw new IllegalArgumentException("Zero - Invalido");
         }
        return numDeno/numCoe;
        
    }
    
    
    
    
}
