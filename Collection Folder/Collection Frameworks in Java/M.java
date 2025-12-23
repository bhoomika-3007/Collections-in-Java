// Map Interface in java // 
import java.util.HashMap;
import java.util.Map; 
public class M {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(101,"deepak");
        m.put(102,"amit");
        m.put(103,"rahul");
        m.clear(); // ye sabhi values  ko delete  karwa dega
        System.out.println(m.containsKey(103));  // ye true output provide kar dega boolean m // 
        System.out.println(m.containsValue("deepak")); // agar value h tho ye true print kara dega // 
        System.out.println(m.get(102)); // isse jha pe bhi 102 ki value milegi vo hi ye print kara dega // 
        m.remove(102); // ye 102 ko remove kara dega // 
        m.replace(103,"ravi"); // aab ye purani value ko new value se replace kara dega // 
        System.out.println(m.size()); // ye hume size bata deta h output m aagya 3 // 
        
        System.out.println(m);  
    }
}
