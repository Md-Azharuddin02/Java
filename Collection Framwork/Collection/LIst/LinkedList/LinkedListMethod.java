package Collection.LIst.LinkedList;
import java.lang.reflect.Method;
import java.util.LinkedList;

public class LinkedListMethod {

   public static void main(String[] args) {
     // heterogeneous ArrayList 
     LinkedList l = new LinkedList();
     l.add(20);
     l.add("prince");
     l.add(true);
     l.add(12.5);
     System.out.println("This is a hetrogeneous linkedList "+l);
     System.out.println("----------------------------------------");



     // Homogeneous ArrayList 
     LinkedList l2 = new LinkedList();
     for(int i=0; i<10; i++){
         l2.add(i*10);
     }
     System.out.println("This is a Homogeneous linkedList "+l2);
     System.out.println("----------------------------------------");



    // -----------add() method inserting element by index value
    // some common method of list interface 
    LinkedList<String> l3= new LinkedList<String>();
    l3.add(0,"prince");
    l3.add(1,"Sonu");
    l3.add(2,"Sharma");
    l3.add(3,"Keshav");
    l3.add(4,"Faizan");
    l3.add(5,"Suman");
    System.out.println("Inserting data with index value "+l3);
    System.out.println("-------------------------");



     // -----------addAll(list) method inserting element by index value
     LinkedList l4 = new LinkedList<>();
     for(int i=0; i<10; i++){
        l4.add(i*10);
    }
    System.out.println("Before adding "+l4);
    l4.addAll(l3);
    System.out.println("Aftert adding "+l4);
    System.out.println("---------------------------");



    // remove(element) method removing data according to the element 
    LinkedList l5 = new LinkedList<>();
    for(int i=0; i<10; i++){
       l5.add(i*10);
   }
   System.out.println("Before removing "+l5);
   l5.remove(5);
   System.out.println("Aftert removing "+l5);
   System.out.println("---------------------------");
// -----------------------------------------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------------------------------------
// There are the following some linkedList Method


// addFirt() method 
   LinkedList af= new LinkedList<>();
   for(int i=0; i<10; i++){
    af.add(i*10);
    }
    System.out.println("Before adding "+af);
    af.addFirst(99);
    System.out.println("After adding "+af);
    System.out.println("----------------------------------");


    // addLast() method 
    LinkedList al= new LinkedList<>();
    for(int i=0; i<10; i++){
     al.add(i*10);
     }
     System.out.println("Before adding "+al);
     al.addLast(99);
     System.out.println("After adding "+al);
     System.out.println("-----------------------------");


      // removeFirst() method 
    LinkedList rf= new LinkedList<>();
    for(int i=0; i<10; i++){
     rf.add(i*10);
     }
     System.out.println("Before removing "+rf);
     rf.removeFirst();
     System.out.println("After removing "+rf);
     System.out.println("-----------------------------");



     // removeLast() method 
    LinkedList rl= new LinkedList<>();
    for(int i=0; i<10; i++){
     rl.add(i*10);
     }
     System.out.println("Before removing "+rl);
     rl.removeLast();
     System.out.println("After removing "+rl);
     System.out.println("-----------------------------");



      // getFirst() method 
    LinkedList gf= new LinkedList<>();
    for(int i=0; i<10; i++){
     gf.add(i*10);
     }
     System.out.println(gf);
     System.out.println("First Element of the linkedlist "+  gf.getFirst());
     System.out.println("-----------------------------");


     // getLast() method 
    LinkedList gl= new LinkedList<>();
    for(int i=0; i<10; i++){
     gl.add(i*10);
     }
     System.out.println(gl);
     System.out.println("Last element of the linkedlist "+gl.getLast());
     System.out.println("-----------------------------");









   }

  
}
