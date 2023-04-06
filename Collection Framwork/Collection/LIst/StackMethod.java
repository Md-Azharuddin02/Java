package Collection.LIst;
import java.lang.reflect.Method;
import java.util.Stack;

import javax.sound.sampled.SourceDataLine;
public class StackMethod {
    public static void main(String[] args) {

    // heterogeneous stack 
    Stack s= new Stack();
    s.push("prince");
    s.push(true);
    s.push(12.5);
    s.push(15);
    System.out.println("This is a hetrogeneous stack "+s);
    System.out.println("--------------------------------");


    // Homogeneous stack 
    Stack<Integer> s1= new Stack<Integer>();
    for(int i=1;i<10;i++){
        s1.push(i*10);
    }
    System.out.println("This is a homogeneous stack "+s1);
    System.out.println("--------------------------------");




    // peak() method
    System.out.println("This is the peak of the statck "+s1.peek());
    System.out.println("--------------------------------");




    // empty() Method
    System.out.println("This will check stack is empty or not " +s1.empty());
    System.out.println("--------------------------------");



    // search() Method
    System.out.println("This method will search the element in the stack : index No = "+s1.search(50));
    }

    
}
