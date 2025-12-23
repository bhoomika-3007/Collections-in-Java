// Stack  is the Legacy class in java // 
// Stack is the child class of the vector class // 
import java.util.Stack; 
public class J{
    public static void main(String[] args) {

          Stack s = new Stack();  // stack m bss ek hi constructor h // 
          s.push("abc");
          s.push("xyz");
          s.push(200);
          s.push(300);
          System.out.println(s.search("abc"));  // output m 4 aagya 
          // agar koi bhi element stack m present nahi h tho minus one print kara dega // 
          // empty method check karega ki stack empty h ki nahi h boolean m value retrun kara dega // 
          System.out.println(s.empty()); // output m aagya false // 
          System.out.println(s); 
          System.out.println(s.pop()); // topmost element remove ho jagya  300 //  
          System.out.println(s); 
          System.out.println(s.pop());
          System.out.println(s); 
          // ek method or hota h peek method in Stack in java // 
          System.out.println(s.peek()); 
          System.out.println(s);                 
        
          
    }
}