package OOPS;
// -----------------------------------Compile time polymorephism-------------------------
// ----------------------------- Method Overloading: changing no. of arguments-----------------

// public class polymorephism {
//     void show(int one){
//         System.out.println(one);
//     }
//     void show(int two,int three){
//         System.out.println(two);
//     }
//     public static void main(String[] args) {
//         polymorephism p= new polymorephism();
//         p.show(1);
//         p.show(2, 3);
//     }
// }


// ---------------------------Method Overloading: changing data type of arguments----------------------
// class polymorephism{
//     void show(int one){
//         System.out.println(one);
//     }
//     void show(float two ){
//         System.out.println(two);
//     }
//     public static void main(String[] args) {
//         polymorephism p= new polymorephism();
//         p.show(1);
//         p.show(2);
//     }
// }

// -------------------Method Overloading is not possible by changing the return type of method only-------------

// class polymorephism{
//     void show(){
//         System.out.println("no return");
//    }
 //   int show(){   //<-------here we can see and error that shows changing the return type is not Overloading
//         int a=10;
//         System.out.println(a);
//     }
// }

// -----------------------------------------we overload java main() method--------------------------
// class polymorephism{
//     public static void main() {
//         System.out.println("without args");
//     }
//     public static void main(String[] args) {
//        System.out.println("with args");
//        polymorephism.main();
//     }
// }
// ------------------------------------------- Method Overloading with TypePromotion--------------------------

// class polymorephism{
//     static void show(int a, long b){
//     System.out.println(a+b);
       
//     }
//     public static void main(String[] args) {
//         polymorephism.show(10, 20);
//     }
// }
// -----------If there are matching type arguments in the method, type promotion is not performed---------

// class polymorephism{
//     static void show(int a, int b){
//         System.out.println(a+b);
//     }
//     static void show(long a,long b){
//         System.out.println(a+b);
//     }
//     public static void main(String[] args) {
//         polymorephism.show(10, 20);
//         polymorephism.show(30, 40);
//     }
// }

