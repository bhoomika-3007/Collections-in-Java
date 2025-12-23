import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class E {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add("abc");
        l.add("xyz");
        l.add('v');
     
        ListIterator itr = l.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());   
        }
        System.out.println("------------------------------------------"); 
         // aab hum previous ka use karenge // 
        while(itr.hasPrevious()){
            System.out.println(itr.previous());    
        }
        l.remove("abc"); 
        System.out.println(l); 
         



        }
    
}
