package Collection.LIst.Vector;

import java.util.Vector;
import java.util.Collections;

public class VectorMethod {
    public static void main(String[] args) {

        // hetrogeneous Vector
        Vector v = new Vector();
        v.add("prince");
        v.add(true);
        v.add(15.5);
        v.add('c');
        v.add(2);
        System.out.println(v);
        System.out.println("---------------------------------");




        // Homegeneous Vector
        Vector<Integer> v1= new Vector<Integer>();
        for(int i=1; i<=10; i++){
            v1.add(i*10);
        }
        System.out.println(v1);
        System.out.println("-----------------------------");
        
        // sorting
        Vector <Integer> vi= new Vector<Integer>();
        vi.add(150);
        vi.add(50);
        vi.add(10);
        vi.add(15);
        vi.add(1);

        Collections.sort(vi);
        System.out.println(vi);
        System.out.println("-----------------------------------");


        // addElement() method 
        Vector<String> s= new Vector<String>();
        s.addElement("prince");
        s.addElement("sonu");
        s.addElement("keshav");
        s.addElement("Hashan");
        System.out.println(s);
        System.out.println("------------------------------------");



        //firstElement() method 
        System.out.println("This is the first element "+s.firstElement());
        //lastElement() method
        System.out.println("This is the last element "+s.lastElement());
        // elementAt() method 
        System.out.println("Element at index  is "+s.elementAt(2));
        //capcity
        System.out.println(s.capacity());
        //size
        System.out.println(s.size());
        System.out.println("--------------------------------");




        // removeElement() method
        Vector <String> vr= new Vector<String>();
        vr.addElement("Sonu");
        vr.addElement("Prince");
        vr.addElement("Sohail");
        vr.addElement("Sanjay");
        vr.addElement("Faizan");

        System.out.println("Before removing "+vr);
        vr.removeElement("Sohail");
        System.out.println("After removing "+vr);
        System.out.println("-------------------------------------");


         // removeElementAt() method
         Vector <String> va= new Vector<String>();
         va.addElement("Sonu");
         va.addElement("Prince");
         va.addElement("Sohail");
         va.addElement("Sanjay");
         va.addElement("Faizan");
 
         System.out.println("Before removing "+va);
         va.removeElementAt(3);
         System.out.println("After removing "+va);
         System.out.println("-----------------------------------");



         // removeElementAll() method
         Vector <String> vra= new Vector<String>();
         vra.addElement("Sonu");
         vra.addElement("Prince");
         vra.addElement("Sohail");
         vra.addElement("Sanjay");
         vra.addElement("Faizan");
 
         System.out.println("Before removing "+vra);
         vra.removeAllElements();
         System.out.println("After removing "+vra);
         //capcity
         System.out.println(vra.capacity());
         //size
         System.out.println(vra.size());





    }
}
