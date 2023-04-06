package Collection.LIst.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethod {
    public static void main(String[] args) {

        // heterogeneous ArrayList 
        ArrayList al= new ArrayList<>();
        for(int i=0; i<10; i++){
            al.add(50+i*5);
        }
        System.out.println("This is a heterogeneous ArrayList"+al);
        System.out.println("-------------------------------------------------");

         // Homogeneous ArrayList
         ArrayList<Integer> al2 = new ArrayList<Integer>();
         for(int i=0; i<10; i++){
            al2.add(10+i*5);
        }
        System.out.println("This is a Homogeneous ArrayList"+al2);
        System.out.println("-------------------------------------------------");


        // -----------add() method inserting only element
        ArrayList<String> s_name= new ArrayList<String>();
        s_name.add("Prince");
        s_name.add("Sonu kr shama");
        s_name.add("Saurabh kr sharma");
        s_name.add("Shafquat");
        s_name.add("Faizan Alam");
        System.out.println("Inserting only the element"+s_name);
        System.out.println("-------------------------------------------------");


        // -----------add() method inserting element by index value
        ArrayList<String> s_name2= new ArrayList<String>();
        s_name2.add(0,"Prince");
        s_name2.add(1,"Sonu kr shamam");
        s_name2.add(2,"Saurabh kr sharma");
        s_name2.add(3,"Shafquat");
        s_name2.add(4,"Faizan Alam");
        System.out.println("Inserting data by index"+s_name2);
        System.out.println("-------------------------------------------------");



         // -----------addAll(list) method inserting element by index value
         ArrayList<String> addlist= new ArrayList<String>();
         addlist.add(0,"Keshav");
         addlist.add(1,"Shubha ");
         addlist.add(2,"Shivam");
         addlist.add(3,"Manuwar");
         addlist.add(4,"Raj");
         System.out.println("Before the adding another list"+addlist);
         addlist.addAll(s_name);
         System.out.println("After Adding the list "+addlist);
         System.out.println("-------------------------------------------------");


        // remove(element) method removing data according to the element 
        ArrayList <String> s_name3= new ArrayList<String>();
        s_name3.add(0,"Prince");
        s_name3.add(1,"Sonu kr sharma");
        s_name3.add(2,"Saurabh kr sharma");
        s_name3.add(3,"Shafquat");
        s_name3.add(4,"Faizan Alam");
        System.out.println("Before removing "+s_name3);
        s_name3.remove("Sonu kr sharma");
        System.out.println("After Removing "+s_name3);
        System.out.println("-------------------------------------------------");


         // remove(index) method removing data according to the index
         ArrayList<String> s_name4= new ArrayList<String>(); 
         s_name4.add(0,"Prince");
         s_name4.add(1,"Sonu kr sharma");
         s_name4.add(2,"Saurabh kr sharma");
         s_name4.add(3,"Shafquat");
         s_name4.add(4,"Faizan Alam");
         System.out.println("Before removing "+s_name4);
         s_name4.remove(3);
         System.out.println("After Removing "+s_name4);
         System.out.println("-------------------------------------------------");

         
        // removeAll(listname) method will remove all the list
        ArrayList<Integer> num= new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            num.add(i*5);
        }
        System.out.println("Bofore removing all"+num);
        num.removeAll(num);
        System.out.println("After removing all "+ num);
        System.out.println("-------------------------------------------------");


        // clear() method will remove all the list
        ArrayList<Integer> num2= new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            num2.add(i*10);
        }
        System.out.println("Bofore removing all"+num2);
        num2.clear();
        System.out.println("After removing all "+ num2);
        System.out.println("-------------------------------------------------");


         // set(index,element) method will replace value on the specific index
         ArrayList<Integer> num3= new ArrayList<Integer>();
         for(int i=0; i<10; i++){
             num3.add(i*10);
         }
         System.out.println("Bofore replacing the value"+num3);
         num3.set(4,100);
         System.out.println("After replacing the value "+ num3);
         System.out.println("-------------------------------------------------");


         // set(index,element) method will replace value on the specific index
         ArrayList<Double> d_num= new ArrayList<Double>();
         for(int i=1;i<10;i++){
            d_num.add(i*1.5);
         }
         System.out.println("The vlaue in the list "+d_num);
         System.out.println("The value we get "+ d_num.get(5));
         System.out.println("-------------------------------------------------");


        // contain(element) method will check the element is prensent in the list or not.
        ArrayList<String> checkNmae= new ArrayList<String>(); 
        checkNmae.add(0,"Prince");
        checkNmae.add(1,"Sonu kr sharma");
        checkNmae.add(2,"Saurabh kr sharma");
        checkNmae.add(3,"Shafquat");
        checkNmae.add(4,"Faizan Alam");
        System.out.println("The list is "+checkNmae);
        System.out.println("Checing the element "+ checkNmae.contains("Prince"));
        System.out.println("Checing the element "+ checkNmae.contains("Keshav"));
        System.out.println("-------------------------------------------------");



        // isEmpty() method will check the lis is empty or not.
        ArrayList<String> checkEmpty= new ArrayList<String>(); 
        ArrayList<String> checkEmpty2= new ArrayList<String>(); 
        checkEmpty.add(0,"Prince");
        checkEmpty.add(1,"Sonu kr sharma");
        checkEmpty.add(2,"Saurabh kr sharma");
        checkEmpty.add(3,"Shafquat");
        checkEmpty.add(4,"Faizan Alam");
        System.out.println("The list is "+checkEmpty);
        System.out.println("Checking the list is empty "+ checkEmpty.isEmpty());
        System.out.println("Checking the list is empty "+ checkEmpty2.isEmpty());
        System.out.println("-------------------------------------------------");




         // set(index,element) method will replace value on the specific index
         ArrayList<Double> sizeCheck= new ArrayList<Double>();
         for(int i=1;i<10;i++){
            sizeCheck.add(i*1.5);
         }
         System.out.println("The size of the list is = "+sizeCheck.size());
         System.out.println("-------------------------------------------------");



        //  Collections.sort() method will sort the list 
        // This is collection method not ArrayList/List/Collection method.
        ArrayList<Integer> sortList= new ArrayList<Integer>();
        sortList.add(50);
        sortList.add(90);
        sortList.add(10);
        sortList.add(100);
        System.out.println("Before the sorting "+sortList);
        Collections.sort(sortList);
        System.out.println("After the sorting "+sortList);
        System.out.println("-------------------------------------------------");



         //  Collections.sort() method will sort the list 
        // This is collection method not ArrayList/List/Collection method.
        ArrayList<Integer> reverSort= new ArrayList<Integer>();
        reverSort.add(50);
        reverSort.add(90);
        reverSort.add(10);
        reverSort.add(100);
        System.out.println("Before the reverse sorting "+reverSort);
        Collections.sort(reverSort, Collections.reverseOrder());
        System.out.println("After the reverse sorting "+reverSort);
        System.out.println("-------------------------------------------------");


        //  Collections.suffle() method will suffle the list 
        // This is collections method not ArrayList/List/Collection method.
        ArrayList<Integer> sufflinglist= new ArrayList<Integer>();
        sufflinglist.add(50);
        sufflinglist.add(90);
        sufflinglist.add(10);
        sufflinglist.add(100);
        sufflinglist.add(150);
        sufflinglist.add(900);
        sufflinglist.add(250);
        sufflinglist.add(300);
        System.out.println("Before the suffling "+sufflinglist);
        Collections.shuffle(sufflinglist);
        System.out.println("After the suffling "+sufflinglist);
        System.out.println("-------------------------------------------------");



        // asList() method will help you to convert arr into ArrayList 
       String arr[]={"Prince","Sonu","Sharma"};
       System.out.println("This is an array "+Arrays.toString(arr));
       ArrayList arr1= new ArrayList(Arrays.asList(arr));
       System.out.println("This is an arrayList"+arr1);

      
        
    }
}
