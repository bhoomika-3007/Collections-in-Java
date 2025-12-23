// collection is a Interface in java // 
// collection interface ka object create nahi kar sakte h // 
import java.util.ArrayList; 
public class C {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();  // ye ek object create ho gaya h  Array List ka // 
   a.add(100);  
   a.add(200);  
   a.add(300); 
   System.out.println(a);

   ArrayList al = new ArrayList();
   al.add("aaa");
   al.add("bbb");
   al.add("ccc"); 
   System.out.println(al);
   a.addAll(al);
System.out.println(a); 
System.out.println(al.add("ddd")); // ye output m true show kara dega // 
System.out.println(al); 
 
 System.out.println(al.contains(200));       // ye output m false show kara dega  kyuki ye 200 ko contain nahi kar rha h //        
 System.out.println(al.isEmpty()); // output m aagya false kyuki koi bhi object empty nahi h // 
 // agar sabhi object ko hata dete h tho ye true show karega // 
 System.out.println(al.size()); // uss collection object m kitne elements h // 

 al.remove(0);  /// iss m hum index value dete h // 
 System.out.println(al);  
 a.removeAll(al);
   System.out.println(a);  
   System.out.println(al);  
   
   System.out.println(al);
    al.clear(); // ye saare collection object ko clear kar deta h // 
    System.out.println(al); 
               
         
    }
     
}
