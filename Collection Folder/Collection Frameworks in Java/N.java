// Map Interface program in java properties of MapInterface in java // 
import java.util.HashMap;
import java.util.Map;
public class N {
    public static void main(String[] args) {
        Map mp = new HashMap();
        mp.put(101,"abhay");
        mp.put(102,"rahul");
        mp.put(104,"vansh");
        mp.put(null,null);
        mp.put(101,"ravi");       
        mp.put(null,"aaa"); // key m hum multiple null value provide nahi kar sakte h // 
        // or hum duplicate key provide nahi kar sakte h         
        System.out.println(mp); 
    }
    
}
