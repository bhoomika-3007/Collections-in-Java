// ArrayList in java //
import java.util.ArrayList;


public class G {
   public static void main(String[] args) {
    ArrayList a = new ArrayList(); 
    a.add(10);
    a.add("abc");
    a.add("xyz"); 
    System.out.println(a); 
    System.out.println("------------------------------------------");  
     
    ArrayList a1 = new ArrayList();
    a1.add(120);
    a1.add("zxd");
    a1.add(50);
    a.addAll(a1);
    System.out.println(a);
 
   }    
}
