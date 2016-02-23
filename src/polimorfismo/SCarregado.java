package polimorfismo;

/**
 *
 * @author alexandre
 */


public class SCarregado {
    
    public static void main(String[] args) {
        
        calculatorTwo ct = new calculatorTwo();
        
        System.out.println(ct.add(1,2));
        
    }
    
}

class calculatorReal{
    
    public  int add(int a, int b){
        
        return a + b;
        
    }
    
      public  int sub(int a, int b){
        
        return a - b;
        
    }
      
       public  double dic(int a, int b){
        
        return a/b;
        
    }
    
}

class calculatorTwo extends calculatorReal{
    
    public  int add(int a, int b, int c){
        
        return a + b + c;
        
    }
    
      public  double sub(int a, double b){
        
        return (double) a - b;
        
    }
      
       public  double dic (int a, int b) throws ArithmeticException {
        
        return a/b;
        
    }
    
}
