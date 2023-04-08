package Collection.Queue.PriorityQueue;
import java.lang.reflect.Method;
import java.util.PriorityQueue;

public class PriorityQueueMetod {
    public static void main(String[] args) {
        
        // add() and offer() method 
        PriorityQueue p= new PriorityQueue<>();
        // p.add("prince");
        // p.offer("sonu");
        // p.add("Sanjay");
        // p.add("satis");
        System.out.println(p);
        System.out.println("-------------------------");
        
        // element() and peek() Method
        // System.out.println(p.element());    //NoSuchElementException
        System.out.println(p.peek());
        System.out.println("-------------------------");




        // remove() and poll() method 
        System.out.println("Before "+p);
        System.out.println("poll "+p.poll());
        System.out.println("After "+p);

       
    }
    
}
