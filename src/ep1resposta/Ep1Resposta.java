package ep1resposta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexandre
 */


public class Ep1Resposta {
    
    public static void main(String[] args) {
        
        File fl = new File("/home/alexandre/Desktop/algoritmoalvorada-master/arquivosteste/logHorm2");
        String[][] logHorm = new String[100000][100];
        String line;
        String[] lineArray;
        int[] maxInLine = new int[100000];
        int contLines = 0;
        InputCoor ip = new InputCoor();
        
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(fl));
            
            while( br.ready()){
               
               line = br.readLine();
               lineArray = line.split(" ");
               
               maxInLine[contLines] = lineArray.length;
               
               for(int i = 0; i < lineArray.length; i++){
                    
                        logHorm[contLines][i] = lineArray[i];
                        
               }
               
               contLines++;
                
            }       
           
           System.out.println("total de linhas do arquivo logHorm " +  contLines);
           System.out.println(ip.readLogHorm(logHorm, maxInLine));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ep1Resposta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ep1Resposta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}

class InputCoor{
    
    public String readLogHorm(String [][] log, int []lineSize) throws FileNotFoundException{
        
        File coor = new File("/home/alexandre/Desktop/algoritmoalvorada-master/coor");
        Scanner sc = new Scanner(coor);
        String [] str = sc.nextLine().split(" ");
        int line;
        int col;
        int contLine = 0;
        int cons = 0;
        String out ="";
       
        while(contLine < str.length - 1){
            
            line = Integer.valueOf(str[contLine]) - 1;
            contLine++;
            col = Integer.valueOf(str[contLine]) - 1;
            contLine++;
            
            if (line >= 100000 || col >= lineSize[line] || col <= 0 || line <= 0 || col >= 100) {
                
                out = out + "-1" + "\n";
                
            } else {
                  
                out = out +  log[line][col] + "\n";
                             
            }    
            
            cons++;
            
        }
        
        System.out.println("Total de consultas " + cons);
        
        return out;        
        
    }
    
}
