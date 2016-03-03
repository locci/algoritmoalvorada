package ep2resposta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alexandre
 */


public class EP2Resposta {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        BufferedReader lerArquivoDeEntrada = new BufferedReader(new FileReader(new File("entrada")));
        String line;
        String out = "";
        EP2Resposta ep = new EP2Resposta();
        
        while(lerArquivoDeEntrada.ready()) {
            
            line = lerArquivoDeEntrada.readLine();
               
            
            if(line.contains("u")) {
                
                out = out + ep.fazUniao(line);
                
            } else {
                
                if(line.contains("s")) {
                    
                   out = out + ep.fazSub(line);
                   
                } else{
                    
                     if(line.contains("i")) {
                         
                         out = out + ep.fazInter(line);
                         
                     } else {
                         
                          out = out + ep.fazCard(line) +"\n";
                          
                     }
                }
            }
            
        }
        
        
        System.out.println(out);
        
    }
    
    public String boxSortUniao (String[] str1, String[] str2){
        
        int[] box = new int[100000];
        String out = "";
        
        if(str1[0].equals("vazio") && str2[0].equals("vazio")) {
            return "{ }" + "\n";
        }
        
        if(!str1[0].equals("vazio")) {
            for(int i=0; i< str1.length; i++){           

                     box[Integer.parseInt(str1[i])] =1;

            }
        }
        
         if(!str2[0].equals("vazio")) {
            for(int i=0; i< str2.length; i++){ 
                
                box[Integer.parseInt(str2[i])] =1;

            }
         }
         
        for(int i=0; i < box.length; i++){            
           
            if(box[i] == 1) {
                
                if(out.equals("")) {
                    out = "{" + i;
                } else {
                    out = out + "," + i;
                }
                
            }            
                 
        }
        
        out = out + "}" + "\n";
        
        return out;
    }
    
    public String boxSortInter (String[] str1, String[] str2){
        
        int[] box = new int[100000];
        String out = "";
        
         if(str1[0].equals("vazio") || str2[0].equals("vazio")) {
            return "{ }" + "\n";
        }
        
                 
             for(int i=0; i< str1.length; i++){            
           
                 box[Integer.parseInt(str1[i])] =1;
                 
              }
             
       
         
         for(int i=0; i< str2.length; i++){        
                
                if(box[Integer.parseInt(str2[i])] == 1) {
                    box[Integer.parseInt(str2[i])] ++;
                }
                
                 
        }
        
        
        for(int i=0; i < box.length; i++){            
           
            if(box[i] > 1) {
                
                if(out.equals("")) {
                    out = "{" + i;
                } else {
                    out = out + "," + i;
                }
                
            }            
                 
        }
        
        out = out + "}" + "\n";
        
        return out;
    }
    
    public String boxSortSub (String[] str1, String[] str2){
        
        int[] box = new int[100000];
        String out = "";
        
        
        if (str1[0].equals("vazio")) {
            return "{ }" + "\n";
        }
        
               
        if (str1[0].equals("vazio") && str2[0].equals("vazio")) {
            return "{ }" + "\n";
        }
        
        
        if(!str1[0].equals("vazio")) {
            
             for(int i=0; i< str1.length; i++){            
           
                 box[Integer.parseInt(str1[i])] =1;
                 
             }
            
        }
        
        if(!str2[0].equals("vazio")) {
            for(int i=0; i< str2.length; i++){        

                    if(box[Integer.parseInt(str2[i])] == 1) {
                        box[Integer.parseInt(str2[i])] ++;
                    }


            }
        }
        
        for(int i=0; i < box.length; i++){            
           
            if(box[i] == 1) {
                
                if(out.equals("")) {
                    out = "{" + i;
                } else {
                    out = out + "," + i;
                }
                
            }            
                 
        }
        
        out = out + "}" + "\n";
        
        return out;
        
    }
       
    public String fazUniao(String str) {
        
        String[] conjuntos; 
        String[] conjunto1;
        String[] conjunto2;
        EP2Resposta ep = new EP2Resposta();  
        
        
        str = str.replace("{ }", "vazio");
        conjuntos = str.split("u");
        
        
        if(conjuntos[0].equals("vazio")){
            conjunto1 = new String[1];
            conjunto1[0] = "vazio";
        } else {
            conjuntos[0] = conjuntos[0].replace("{","");
            conjuntos[0] = conjuntos[0].replace("}", "");
            conjuntos[0] = conjuntos[0].replace(" ", "");  
            if(conjuntos[0].length() == 1){
                 conjunto1 = new String[1];
                 conjunto1[0] = conjuntos[0];
            } else {
                 conjunto1 = conjuntos[0].split(",");  
            }
                     
        }
        
       if(conjuntos[1].equals("vazio")){
              conjunto2 = new String[1];
              conjunto2[0] = "vazio";
        } else {
            conjuntos[1] = conjuntos[1].replace("{","");
            conjuntos[1] = conjuntos[1].replace("}", "");
            conjuntos[1] = conjuntos[1].replace(" ", ""); 
            if(conjuntos[1].length() == 1){
                 conjunto2 = new String[1];
                 conjunto2[0] = conjuntos[1];
            } else {
                 conjunto2 = conjuntos[1].split(",");  
            }
              
        }    
              
       return ep.boxSortUniao(conjunto1, conjunto2);     
       
    }
    
     public String fazInter(String str) {
         
        
        String[] conjuntos; 
        String[] conjunto1;
        String[] conjunto2;
        EP2Resposta ep = new EP2Resposta();     
               
        conjuntos = str.split("i");
        
        if(conjuntos[0].contains("{ }")){
            
            conjunto1 = new String[1];
            conjunto1[0] = "vazio";
            
        } else {
            
           conjuntos[0] = conjuntos[0].replace("{","");
           conjuntos[0] = conjuntos[0].replace("}","");
           conjuntos[0] = conjuntos[0].replace(" ","");  
           
           if(conjuntos[0].length() == 1) {
                
                conjunto1 = new String[1];
                conjunto1[0] = conjuntos[0];
               
           } else {
               
                conjunto1 = conjuntos[0].split(",");
                
           }            
            
        }
        
        if(conjuntos[1].contains("{ }")){
            
            conjunto2 = new String[1];
            conjunto2[0] = "vazio";
            
        } else {
            
           conjuntos[1] = conjuntos[1].replace("{","");
           conjuntos[1] = conjuntos[1].replace("}","");
           conjuntos[1] = conjuntos[1].replace(" ","");  
           
           if(conjuntos[1].length() == 1) {
                
                conjunto2 = new String[1];
                conjunto2[0] = conjuntos[1];
               
           } else {
               
                conjunto2 = conjuntos[1].split(",");
                
           }            
            
        }     
        
        return ep.boxSortInter(conjunto1, conjunto2);        
       
    }
     
     public String fazSub(String str) {
         
  
        String[] conjuntos; 
        String[] conjunto1;
        String[] conjunto2;
        EP2Resposta ep = new EP2Resposta();       
          
        conjuntos = str.split("s");
              
        if(conjuntos[0].contains("{ }")){
            
            conjunto1 = new String[1];
            conjunto1[0] = "vazio";
            
        } else {
            
           conjuntos[0] = conjuntos[0].replace("{","");
           conjuntos[0] = conjuntos[0].replace("}","");
           conjuntos[0] = conjuntos[0].replace(" ","");  
           
           if(conjuntos[0].length() == 1) {
                
                conjunto1 = new String[1];
                conjunto1[0] = conjuntos[0];
               
           } else {
               
                conjunto1 = conjuntos[0].split(",");
                
           }            
            
        }
        
        if(conjuntos[1].contains("{ }")){
            
            conjunto2 = new String[1];
            conjunto2[0] = "vazio";
            
        } else {
            
           conjuntos[1] = conjuntos[1].replace("{","");
           conjuntos[1] = conjuntos[1].replace("}","");
           conjuntos[1] = conjuntos[1].replace(" ","");  
           
           if(conjuntos[1].length() == 1) {
                
                conjunto2 = new String[1];
                conjunto2[0] = conjuntos[1];
               
           } else {
               
                conjunto2 = conjuntos[1].split(",");
                
           }            
            
        }    
        
         
        return ep.boxSortSub(conjunto1, conjunto2);  
        
      
    }
     
     public int fazCard(String str) {
         
        String saida = "";
        String[] conjunto; 
       
        EP2Resposta ep = new EP2Resposta();
        
        saida = str.replace("{","");
        saida = saida.replace("}", "");
        saida = saida.replace(" ", "");    
        if(!saida.contains(",")) {
            return 0;
        }
        conjunto = saida.split(",");
        return conjunto.length;        
        
    }
    
}
