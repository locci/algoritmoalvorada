 
package AulaExceção;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.html.HTML;

/**
 *
 * @author alexandre
 */


public class MainTwo {
    
    public static void main(String[] args) {
        
        File fl = new File("entrada");
              
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(fl));
            String line = "";
            
            while (br.ready()) {
                
                System.out.println(br.readLine());                
                
            }
            
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainTwo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainTwo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            System.out.println("Tratamento encerrado.");
            
        }
                
    }
    
}
