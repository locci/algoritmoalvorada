package polimorfismo;

public class MainSEscrito {
    
    public static void main(String[] args) {
        
        Fish fi = new Fish();
        CodFish cf = new CodFish();
        
        fi.colorFish();
        cf.colorFish();
        cf.prFish();
        
    }
}

class Fish{
    
    public void colorFish(){
        
        System.out.println("Red");
        
    }
    
}

class CodFish extends Fish{
    
       public void colorFish(){
         
        System.out.println("Green");
        
    }
      
        public void prFish(){
         
            super.colorFish();
            this.colorFish();
            
        }
    
}