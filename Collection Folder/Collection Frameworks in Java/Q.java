// TreeMap in java 
import java.util.TreeMap;

public class Q {
    public static void main(String[] args) {
        TreeMap t = new TreeMap();
        t.put(101,"abc");
        t.put(103,"abd");
        t.put(102,"abe");
        t.put(105,"abr");
        t.put(107,"abg");
        t.put(104,"abh");
        t.put(106,"abk");


   // System.out.println(t.ceilingEntry(103));  agar 103 nahi hota tho ye usse se bada value ko output m print kara deta // 

   // System.out.println(t.ceilingKey(104)); ye bss key value ko hi print karata h //           
  //   t.clear(); // saare methods clear ho jayenge iss se // 
   // System.out.println(t.floorEntry(108));     jo bhi 108 se kaam h ye usko print kara dega // 
     System.out.println(t.get(105)); // ye 105 ki value ko print kara dega // 
     // or agar jase ki koi key nahi h tho ye uski jagha pe null print kara deta h // 







  // aab hum upper value ko revrse kar ke dhekte h kya output aata h // 


        // t.put("abc",101);
        // t.put("abd",102); 
        // t.put("abg",103);
        // t.put("abh",104);
        // t.put("abu",105);
        // t.put("abj",106);
        // t.put("abk",107);
        // System.out.println(t); 
    }
}  