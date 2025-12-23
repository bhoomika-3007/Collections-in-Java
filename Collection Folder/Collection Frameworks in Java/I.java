// Vector in java // 
import java.util.Vector;

public class I {
    public static void main (String [] args){
        Vector v = new Vector();
        v.add("abc"); // ye collection interface ka method h // 
        v.add("xyz");  // ye list interface ke method h  kyuki hum iss m index value bhi provide kara sakte h // 
        v.addElement(10);  // ye vector legacy class ke method h // 
          v.setElementAt("aaaa", 2);       
        System.out.println(v);  
        System.out.println(v);   
        System.out.println(v.firstElement()); // ye only first method ko hi show karega // 
        System.out.println(v.lastElement()); // ye only last element ko hi show karega output m // 
        System.out.println(v.removeElement("abc"));  // ye boolean value return karta h tho output m true aa jaygya // 
        System.out.println(v); 
        v.removeElementAt(1);
        System.out.println(v); 
        System.out.println(v.capacity()); // output m aagya 10 capacity h uski //  
        // capacity hoti h ki kitne elements hum store kara sakte h // 
        // by default iski capacity 10 hoti h // 
        // iski capacity double hoti rheti h // 
      
    }
    
}
