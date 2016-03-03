
package concorrente;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author alexandre
 */


public class Main {
    
    static ArrayList<Integer> lis = new ArrayList<Integer>();         
    private final static int NUM = 10000000;
    
    public static void main(String[] args) {
                
                int soma = 0;
                Main ma = new Main();
                Main.incList();
                new Thread(t1).start();
	new Thread(t2).start();
                new Thread(t3).start();
	new Thread(t4).start();
                new Thread(t5).start();
                
                              
                
    }
    
    
    public static void incList() {
        
        int value = 0;
        
        for(int i=0; i < NUM; i++) {
            
            value = (int)(Math.random() * 1000);
           lis.add(value);
           
            
        }
                
    }
    
        
    
        private static Runnable t1 = new Runnable() { 
        
                public void run() {   
                        
                        int cont = 0;
                        System.out.println("t1");
                        
                        for(int i = 0; i <= 2000000; i++) {
                            
                            if(lis.get(i) < 100) {
                                cont ++;
                            }
                            
                        }
                        
                        System.out.println("Total de Valores abaixo de 100 T1 " + cont);
                        
        
                 };

        };
    
        private static Runnable t2 = new Runnable() { 
        
                public void run() {   
        
                        int cont = 0;
                         System.out.println("t2");
                        
                        for(int i = 2000001; i <= 4000000; i++) {
                            
                            if(lis.get(i) < 100) {
                                cont ++;
                            }
                            
                        }
                        
                        System.out.println("Total de Valores abaixo de 100 T2 " + cont);
        
                 };

        };
        
         private static Runnable t3 = new Runnable() { 
        
                public void run() {   
        
                        int cont = 0;
                         System.out.println("t3");
                        
                        for(int i = 4000001; i <= 6000000; i++) {
                            
                            if(lis.get(i) < 100) {
                                cont ++;
                            }
                            
                        }
                        
                        System.out.println("Total de Valores abaixo de 100 T3 " + cont);
        
                 };

        };
         
        private static Runnable t4 = new Runnable() { 
        
                public void run() {   
        
                        int cont = 0;
                         System.out.println("t4");
                        
                        for(int i = 6000001; i <= 8000000; i++) {
                            
                            if(lis.get(i) < 100) {
                                cont ++;
                            }
                            
                        }
                        
                        System.out.println("Total de Valores abaixo de 100 T4 " + cont);
        
                 };

        };
        
        private static Runnable t5 = new Runnable() { 
        
                public void run() {   
        
                        int cont = 0;
                         System.out.println("t5");
                        
                        for(int i = 8000001; i <= 9999999; i++) {
                            
                            if(lis.get(i) < 100) {
                                cont ++;
                            }
                            
                        }
                        
                        System.out.println("Total de Valores abaixo de 100 T5 " + cont);
        
                 };

        };

}
