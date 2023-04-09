import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
class HashMapMethod{

    public static void main(String[] args) {

        // HashMap for homogeneous data
        // put() Method
        // entrySet()
        HashMap h= new HashMap<>();
        h.put(101, "prince");
        h.put(102, true);
        h.put(105, null);
        h.put(103, 1.1);
        h.put(104, 105);
        System.out.println(h.entrySet());
        System.out.println("---------------------");


        // HashMap for Homogeneous data
        HashMap<Integer, String> s= new HashMap<Integer, String>();
        s.put(101, "prince");
        s.put(102, "Sonu");
        s.put(103, "Keshav");
        s.put(104, "Mannu");
        s.put(105, "saurabh");
        

        // get() Method
        System.out.println(s.get(101));
        System.out.println(s.entrySet());
        System.out.println("------------------------------");

        // remove() Method
        System.out.println(s.remove(102));
        System.out.println(s.entrySet());
        System.out.println("--------------------------------");


        //containskey() method
        System.out.println(s.containsKey(101));
        System.out.println(s.entrySet());
        System.out.println("----------------------------------");

        
        // containVlaue() method 
        System.out.println(s.containsValue("Zikrullah"));
        System.out.println(s.entrySet());
        System.out.println("-----------------------------------");

        //isEmpty()
        // size()
        // clear() Method
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        // System.out.println(s.clear());
        


        //keySet() method
        //Values() method 
        System.out.println(s.keySet());
        System.out.println(s.values());
        System.out.println("-----------------------------------------");




        // #################################### 
        // Entry Inteface
        // get() Method
        // set() Method
       for(Map.Entry e:s.entrySet()){

           System.out.println(e.getKey()+"   "+e.getValue());
       }

    }
}