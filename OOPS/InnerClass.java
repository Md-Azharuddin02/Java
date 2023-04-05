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

// -----------------------------------------------Java Local inner class----------------------------


// class First {
//     private int one=10;
//     void first(){
//         class Secound{
//             final int a=20;
//             void secound(){
//                 class Third{
//                     final int b=30;
//                     void third(){
//                         System.out.println("third class method "+one+" "+a+" "+b);
//                     }
//                 }
//                 Third t= new Third();
//                 t.third();
//             }
//         }
//         Secound s = new Secound();
//         s.secound();
//     }
// }
// class InnerClass {
//     public static void main(String[] args) {
//         First f= new First();
//         f.first();
//     }
// }

// --------------------------------------Java static nested class---------------------

