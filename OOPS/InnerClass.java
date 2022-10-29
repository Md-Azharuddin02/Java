package OOPS;

// -----------------------------------------Java Member Inner class----------------------------------
// class Outer{
//     private int a=10;
//     class Inner{
//         void show(){
           
//             System.out.println("the value of outer private intiger "+a);
//         }
//     }
// }

// public class InnerClass {
//     public static void main(String[] args) {
        // Outer o = new Outer();
        // Outer.Inner a= o.new Inner();                    //first method 
        // a.show();

        // Outer.Inner i = new Outer().new Inner();         // secound method 
        // i.show();
//     }
// }


// --------------------------------------------------------Java Anonymous inner class-----------------------------
// -----------------------------------------------------------1.Interface--------------------------------------------

// interface Outer{
//     void show();
//     void display();
// }

// class InnerClass{
//     public static void main(String[] args) {
//        Outer I= new Outer() {

//         @Override
//         public void show() {
//             System.out.println("First method");            
//         }

//         @Override
//         public void display() {
//             System.out.println("secound method");
//         }
//     };
//     I.show();
//     I.display();
//     }
// }
// --------------------------------------------------------Java Anonymous inner class-----------------------------
// -------------------------------------------------------------abstract class----------------------------
// abstract class Outer{
//     void show(){
//         System.out.println("first");
//     }
//     void display(){
//         System.out.println("secound");
//     }
// }
// class InnerClass{
//     public static void main(String[] args) {
//         Outer I= new Outer() {
        
//             @Override
//             public void show(){
//                 System.out.println("first method");
//             }
//             @Override
//             public void display(){
//                 System.out.println("secound method ");
//             }
//         };
//         I.show();
//         I.display();
//     }
// }