 package algoritmoalvorada;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Algoritmoalvorada {    
    public static void main(String[] args) {
        
         
       ArrayQQ[] ar = new ArrayQQ[3];
       ar[0].idade = 10;
       ar[1].idade = 11;
       ar[2].idade = 12;
       
       int[] a = {1,2,3};
       
       Object[] ob = new Object[3];       
       ob[0] = new Object();
       
       switch(ar[0].idade){
           case 1: System.out.println("1");
                     break;
            case 20: System.out.println("20");
                     break;
            default: System.out.println("40");
                        break;
       }
       
       char c= '1';
       
       int k = 10;  double wb =50;
       
       k = (int) wb;
       
       String str = "10";
       
       int kk = Integer.parseInt(str);
       
       
       
       
    }    
}

class ArrayQQ{
    
    public int idade;
    
}