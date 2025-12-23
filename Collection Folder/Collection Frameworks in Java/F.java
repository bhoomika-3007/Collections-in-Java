// Enumeration ye Java ye ek cursor h jase ki Iterator or ListIterator h ye dono bhi ek cursor h  //   
// methods of enumeration in java are hasMoreElement() , nextElement()  
// enumeration m hum elements ko sirf forward direction m hi retrive kar sakte h // 
// enumeration cursor can be used only for read operations // 
import java.util.Enumeration;
import java.util.Vector; 
public class F {
    public static void main(String[] args) {
      Vector v = new Vector();
      v.add(10);
      v.add("abc");
      v.add("xyz");
      v.add(15.2);
     //  System.out.println(v);   
      Enumeration e = v.elements(); 
     while(e.hasMoreElements()){
        System.out.println(e.nextElement());         
     }
      
        
    }
    
}     
