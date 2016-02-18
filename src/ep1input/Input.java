
package ep1input;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexandre
 */


public class Input {
    
    public void writeFileOutput(String path) throws IOException {
        
        if(!path.contains("coor")){
            File fl = new File(path);
            FileWriter fw = new FileWriter(fl);
            int line = (int)(Math.random()*100000);
            int read = 0;
            for(int j = 0; j <= line; j++ ){
                read =  (int)(Math.random()*100);
                for(int i =0; i <= read; i++){
                    fw.write( (int)(Math.random()*100) + " ");
                }
                fw.write("\n");
                
            }
            fw.close();
        } else {
            
            File fl = new File(path);
            FileWriter fw = new FileWriter(fl);
            int coor = (int)(Math.random()*1000000);
            boolean lineCol = true;
            for(int j = 0; j < coor*2; j++ ){    
                
                if(lineCol) {
                    fw.write( (int)(Math.random()*150000) + " ");
                    lineCol = false;
                } else {
                    fw.write( (int)(Math.random()*150) + " ");
                    lineCol = true;
                }
                 
                  
            }
            fw.close();
        }
        
        
    }
    
    public static void main(String args[]) {
        
        Input in = new Input();
        try {
//            in.writeFileOutput("logHorm1");
//            in.writeFileOutput("logHorm2");
//            in.writeFileOutput("logHorm3");
            in.writeFileOutput("coor");
        } catch (IOException ex) {
            Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
