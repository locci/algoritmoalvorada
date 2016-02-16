
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
        
    }
    
    public static void main(String args[]) {
        
        Input in = new Input();
        try {
            in.writeFileOutput("coor1");
            in.writeFileOutput("coor2");
            in.writeFileOutput("coor3");
        } catch (IOException ex) {
            Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
