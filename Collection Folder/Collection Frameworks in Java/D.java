//  listiterator  in java // 
import java.util.ArrayList; 
import java.util.Iterator;
import java.util.List;
  

public class D {
    public static void main(String[] args) {
        
         List l = new  ArrayList(); // ye hum ne array list ka object create kar diya h // 
           l.add(100);
           l.add("abc");
           l.add("xyz"); 
       // System.out.println(l); ye sabhi ko ek sath print kara dega pr hume alag alag chiye tho iss liye hum iterator ka use karenge //  
      Iterator itr = l.iterator();
      while(itr.hasNext()){ // has next method boolean value provide karta h //  
    System.out.println(itr.next());   // ye ek ek kar ke objects ko return karta chala jagya // 

               // Iterator m bss three methods h hasNext() , next(), and remove () // 
      }  

    }
    
}
