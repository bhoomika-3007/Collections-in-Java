// HashSet in java 
// ye ek implemented class h set interface ki java.uitl package m present h //
// HashSet underline data-structure is Hashtable //
// HashSet ke piche Map kaam karta h //               
//  HashSet are non-Synchronized data Structure // 
 import java.util.ArrayList;
 import java.util.HashSet;

public class K {
    public static void main(String[] args) {

ArrayList al = new ArrayList();
    al.add("abc");
    al.add("xyz");
    al.add(300); 
    // abb mujhe ye arraylist ke emlemts ko hashset me add karna h // 



        HashSet s = new HashSet(al); 
        // s.add("abc");
        // s.add(10);
        // s.add("xyz");
        // s.add(40);   
      //   System.out.println(s); 
 
        // HashSet m hum Duplicate value store nahi kara sakte h // 
        //   s.add("abc");
        //   s.add("abc");
         //  System.out.println(s);  
          
      // HashSet m hum ek se jada null value store nahi kara sakte h // 
        
        //   s.add(null);
        //   s.add(null);
   
            // System.out.println(s); 
  // hashSet insertion order ko follow nahi kar sakta h // 
  // Hashset sorting order ko follow nahi karta h // 

   s.add(10);
   s.add(20);
   s.add(30);
   s.add(40);
   s.add(50); 

   System.out.println(s);      
   //System.out.println(s); 

//    Iterator itr = s.iterator(); // ye elements ko ek ek kar display kara dega // 
//    while(itr.hasNext()){
//     System.out.println(itr.next());    
   } 
    
    

} 

      
