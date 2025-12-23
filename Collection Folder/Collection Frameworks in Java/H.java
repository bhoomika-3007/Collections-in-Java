// LinkedList and Methods in java // 
import java.util.LinkedList;
public class H {
      public static void main(String[] args) {
        LinkedList l = new LinkedList(); // ye hum ne object create kar diya h // 
        l.add("abc");
        l.add(20);
        l.add("xyz");
        l.add(23); 
        l.add(234.5);
        l.add('c');  
        System.out.println(l); 
        System.out.println("------------------------------------"); 

        l.addFirst("zxcv");
        System.out.println(l); 
        System.out.println("---------------------------------");
        l.addLast("bngh"); 
        System.out.println(l); 

        l.removeFirst();
        System.out.println(l); 
        l.removeLast();
        System.out.println(l); 
        System.out.println(l.getFirst()); 
        System.out.println(l.getLast());   




        }

    
}
