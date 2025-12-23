// HashMap in java //
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;                                  

public class O {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(101,"abhay");
        hm.put(102,"prince");
        hm.put(103,"yash");
        hm.put(105,"Hitesh");

        // abb hum value ko ek ek kar ke print karwna chathe h // 
        // Set s = hm.entrySet();
        //System.out.println(s); 
        
        // aab hum sabhi vale ko ek ek kar ke print kara sakte h // 
        // by using Iterator // 
   Set s = hm.entrySet(); 
   Iterator itr = s.iterator();
   while(itr.hasNext()){
     //  System.out.println(itr.next());
   // aab hume key or value alag alag chiye // 
   Map.Entry entry = (Map.Entry) itr.next();
   System.out.println(entry.getKey()+"->"+entry.getValue()); 


   }
    }
    
}
