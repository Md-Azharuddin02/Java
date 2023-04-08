package Collection.Set.HashSet;
import java.lang.reflect.Method;
import java.util.HashSet;

public class HashSetMethod {

    public static void main(String[] args) {
      
    // Hetrogeneous HashSet
    HashSet s= new HashSet();
    s.add("prince");
    s.add(15.5);
    s.add('c');
    s.add(20);
    s.add(true);
    s.add(null);
    System.out.println("This is a heterogeneous hashaset "+s);
    System.out.println("-------------------------------------");


    // Homegeneous HashSet 
    HashSet<Integer> i= new HashSet<Integer>();
    for(int j=1; j<10;j++){
        i.add(j);
    }
        System.out.println("This is a homogenous hashset"+i);
        System.out.println("------------------------------------");
    

    // Increase the size of the hashset (by defaul size is 16)
    HashSet<String> hs= new HashSet<String>(100);

    // Increase the load factor of the hashaset(by defaul 0.75)
    HashSet<Double> hd= new HashSet<Double>(200,90);


    //Add ()method
    HashSet ha= new HashSet();
    ha.add("prince");
    ha.add("Sonu");
    ha.add("Sharma");
    System.out.println(ha);

    // contain() Method 
    System.out.println(ha.contains("prince"));

    // containAll() Method
    System.out.println(ha.containsAll(ha));

    // isEmpty(); Method
    System.out.println(ha.isEmpty());
    System.out.println("------------------------");


    // AddAll() Method
    System.out.println("Before the add "+ha);
    ha.addAll(i);
    System.out.println("After the adding "+ha);
    System.out.println("--------------------------------------");



    // remove() Method
    System.out.println("Before the removing "+ha);
    ha.remove("Prince");
    System.out.println("After the removing "+ha);

    // removeAll() Method 
    System.out.println("Before the removing "+ha);
    ha.removeAll(ha);
    System.out.println("After the removing "+ha);












    }
}
