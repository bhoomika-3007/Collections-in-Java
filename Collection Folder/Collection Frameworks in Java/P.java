// HashMap in java //  
// iss m hum use karnege foreach loop ka value ko alag alag print karane ke liye // 
// HashMap se values Retrive karai h hum ne //  
import java.util.HashMap;
import java.util.Map; 

public class P {
   public static void main (String [] args){
      HashMap<Integer,  String> hm = new HashMap();
         hm.put(101,"aabc");
         hm.put(102,"aabb");
         hm.put(103,"aabc");
         hm.put(104,"aabd");
         hm.put(105,"aabe");
         System.out.println(hm);
         for(Map.Entry me : hm.entrySet()){
            System.out.println(me.getKey()+"->"+me.getValue()); 

         }
   }
} 