// TreeSet in java // 
import java.util.TreeSet; 
public class L {
    public static void main (String [] args){
TreeSet t = new TreeSet();
// t.add(10);
// t.add(50);
// t.add(20);
// t.add(90);
// t.add(30);
 // System.out.println(t);  
 
t.add("Kunal"); 
t.add("abhay");
t.add("amit");
t.add("kamal");
t.add("xyz"); 
t.add("deepesh"); 
 
// t.add(null); 
// System.out.println(t); 
 t.clear(); // ye sabhi elements ko clear kara dega // 
 t.remove("amit"); // ye amit ko remove kara dega // 
  
 
System.out.println(t); 
    }
}
