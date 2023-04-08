package Collection.Set.LinkedHashSet;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;

public class LinkedHashSetMethod {
    public static void main(String[] args) {
        
        // add() method with Hetrogeneous data and the initialCapcity is 100.
        LinkedHashSet l= new LinkedHashSet(100);
        l.add("prince");
        l.add(true);
        l.add(15.5);
        l.add(null);
        l.add('c');
        l.add(15);

        System.out.println("hetrogeneus linkedhashset "+l);

        //   isEmpty() method
        System.out.println("linkedHashSet is empty ? "+l.isEmpty());

        // size() method
        System.out.println("The size of the linkedHashSet "+l.size());

        //isContain() method
        System.out.println("LikedHashSet Contain Prince ? "+l.contains("prince"));
        System.out.println("--------------------------------------------------------");



        // homogenous LinkedHashSet and initialCapacity is 200 and loadFactor is 90
        LinkedHashSet<String> i = new LinkedHashSet<String>(200,90);
        i.add("Sonu Sharma");
        i.add("Shakti");
        i.add("Faizan");
        i.add("Mannu");
        i.add("Prince");

        //remove() metod
        System.out.println("Before the removing "+i);
        i.remove("Mannu");
        System.out.println("After the removing "+i);

        // containAll() method 
        System.out.println(i.containsAll(i));
        



    }
}
