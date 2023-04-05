package OOPS;
// -----------------------------------Compile time polymorephism-------------------------
// ----------------------------- Method Overloading: changing no. of arguments-----------------
// ----------------------------- Method Overloading: changing no. of arguments-----------------
// ----------------------------- Method Overloading: changing no. of arguments-----------------
// ----------------------------- Method Overloading: changing no. of arguments-----------------
// ----------------------------- Method Overloading: changing no. of arguments-----------------
// ----------------------------- Method Overloading: changing no. of arguments-----------------


// import java.io.UncheckedIOException;


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

// ------------------------A real example of Java Method Overriding---------------------------
// ------------------------A real example of Java Method Overriding---------------------------
// ------------------------A real example of Java Method Overriding---------------------------
// ------------------------A real example of Java Method Overriding---------------------------
// ------------------------A real example of Java Method Overriding---------------------------
// ------------------------A real example of Java Method Overriding---------------------------
// ------------------------A real example of Java Method Overriding---------------------------
// ------------------------A real example of Java Method Overriding---------------------------

// class Bank{
//     int rateOfIntrest(){
//         return 0;
//     }
// }
// class SBI extends Bank{
//     int rateOfIntrest(){
//         return 7;
//     }
// }
// class AXIS extends Bank{
//     int rateOfIntrest(){
//         return 10;
//     }
// }
// class PNB extends Bank{
//     int rateOfIntrest(){
//         return 8;
//     }
// }
// public class polymorephism{
//     public static void main(String[] args) {
//         AXIS a= new AXIS();
//         PNB p= new PNB();
//         SBI s= new SBI();

//         System.out.println("Rate of intrest of SBI Bank "+s.rateOfIntrest());
//         System.out.println("Rate of intrest of AXIX Babk "+a.rateOfIntrest());
//         System.out.println("Rate of intrest of PNB Bank "+p.rateOfIntrest());
//     }
// }
// ----------------------------------------Rules for method overriding----------------------
// -------------------------------------1. Overriding and Access-Modifiers---------------------------

// class Parent{
//     private void show(){
//         System.out.println("Parent class private method method ");
//     }
//     protected void show2(){
//         System.out.println("Parent class protected method");
//     }
// }
// class child extends Parent{
//     // @Override
//     // private void show(){           //here we used private keyword that cant be override
//     //     System.out.println("child class private method ");
//     // }
//     @Override
//     protected void show2(){            // here same identifier is used for the override that is possible
//         System.out.println("child class protected method ");
//     }
// }
// class child2 extends Parent{
//     @Override
//     public void show2(){             // we can user less secure identifier for the override the method
//         System.out.println("child2 class public method ");
//     }
// }
// class polymorephism{
//     public static void main(String[] args) {
//         child c1= new child();
//         child2 c2= new child2();

//         c1.show2();
//         c2.show2();
//     }
// }

// -------------------------------------2. Final methods can not be overridden---------------------

// class Parent{
//     final void show(){
//         System.out.println("parent class final method");
//     }
// }
// class child extends Parent{
//     @Override
//     final void show(){   // here there is compile time error because we cant override final method
//         System.out.println("child class final method ");
//     }
// }

// -----------------3. Static methods can not be overridden(Method Overriding vs Method Hiding) -------
// class parent{
//     static void show1(){
//         System.out.println("parent class static method");
//     }
//     void show2(){
//         System.out.println("parent class none static method ");
//     }
// }
// class child extends parent{
//     static void show1(){     // here this static class will hide into parent class 
//         System.out.println( "child class static method ");
//     }
//     @Override
//     void show2(){
//         System.out.println( "Child class none static method ");
//     }
// }
// class polymorephism{
//     public static void main(String[] args) {
//         parent p= new parent();
//         parent p2= new child();

//         p.show1();
//         p.show2();

//         p2.show1();
//         p2.show2();
//     }
// }

// ----------------------------- 4.The overriding method must have same return type -------------
// class parent{
//     void show(){
//         System.out.println(" parent class none return data type method ");
//     }
// }
// class child extends parent{
//     @Override
//     int show(){         // here it will throw compile time error cause we are using diffrent data type in return
//         System.out.println("class child int return data type method ");
//     }
// }

// ----------------------- 5. Invoking overridden method from sub-class using super keyword------------

// class parent{
//     void show(){
//         System.out.println("parent class method");
//     }
// }
// class child extends parent{
//     @Override
//     void show(){
//         super.show();
//     }
    
// }
// class polymorephism {
//     public static void main(String[] args) {
//         child p = new child();
//         p.show();
//     }
// }

// ------------------------------------Overriding and Exception-Handling----------------------------
// --------Rules 1:- if the parent class doesnt decleard any checked exception then child class can not declear any checked expectio but child class can declear any unchecked exceprtions. 

//---------Rules 2: - if the parent class decleard any exception then child class can decleard same excepton or no exception . but cant decleard any higher exception than parent class


// class Parent{
//     void show(){
//         System.out.println("parent class method doesnt decleard any excpetions");
//     }
//     void show1(){
//         System.out.println("parent class mthod  doesnt decleard any exeptons ");
//     }
//     void show2() throws Exception{
//         System.out.println("parent class  mthod decleard a checked excepton");
//     }
// }
// class child extends Parent{
//     // @Override
//     // void show() throws Exception{     //here you will get a compile time error couse using checked exceptions
//     // }
//     @Override
//     void show1() throws UncheckedIOException{
//         System.out.println("child class method is using unchecked exceptions ");
//     }
//     @Override
//     void show2()throws Exception{
//         System.out.println("child class are using checked exceptions");
//     }
// }
// class polymorephism{
//     public static void main(String[] args) throws Exception {
//         Parent p= new child();
//         p.show();
//         p.show1();
//         p.show2();
//     }
// }
// --------------------------------------------super keyword in java---------------------------------------
// --------------------------------------------super keyword in java---------------------------------------
// --------------------------------------------super keyword in java---------------------------------------
// --------------------------------------------super keyword in java---------------------------------------
// --------------------------------------------super keyword in java---------------------------------------
// --------------------------------------------super keyword in java---------------------------------------

// -----------Rule 1 :- it can be use to invoke immedate class instance veriable
//------------Rule 2 :- it can be use to invoke immedate class methd
//------------Rule 3 :- it can be use to invoke immedate class constructor
// --------------------Note we will use only super keyword for the constructor calling


// class Parent{
//     String color="Black";
//     Parent(){
//         System.out.println("Parent class constructor");

//     }
//     void display(){
//         System.out.println("parent class method");
//     }

// }
// class child extends Parent{
//     child(){
//         super();          //parent class constructor
//     }
//     void show(){
//         System.out.println(super.color);// parent class instance variable

//         super.display();   // parent class method
//     }
// }
// class polymorephism{
//     public static void main(String[] args) {
//         child p= new child();
//         p.show();
//     }
// }

// ---------------------------------------------instance initialize block------------------------------
// ---------------------------------------------instance initialize block------------------------------
// ---------------------------------------------instance initialize block------------------------------
// ---------------------------------------------instance initialize block------------------------------
// ---------------------------------------------instance initialize block------------------------------

// class Parent {
//     boolean show(){
//         System.out.println("parent class method");
//         return false;
//     }
    
//     Parent(){
//         System.out.println("parent class constructor");
//     }
   
//     {
//         System.out.println( "instance block");
//     }
// }
// class child extends Parent{
    
//     void display(){
//         System.out.println(super.show());
//     }
//     child(){
//         super();
//     }
// }
// class polymorephism {
//     public static void main(String[] args) {
//         Parent p= new child();
//         p.show();
//     }
// }

// -----------------------------------------------final keyword------------------------------------------
// -----------------------------------------------final keyword------------------------------------------
// -----------------------------------------------final keyword------------------------------------------
// -----------------------------------------------final keyword------------------------------------------
// -----------------------------------------------final keyword------------------------------------------

// 1. java final variable:-

// class Parent {
//     final int number= 10;
//     String name="prince";
//     void show(){
//         System.out.println("Parent class final variable "+number);
//     }
// }
// class child extends Parent{
//     @Override
//     void show(){
//         // super.number=20;           //it will throw compile time error cause parent class refrence variable is a final variable 
//         System.out.println(number);
//         super.name="sainger";
//         System.out.println(name);
//     }
// }
// class polymorephism{
//     public static void main(String[] args) {
//         Parent p= new child();
//         p.show();
//     }
// }

// 2. java final method:- java final method can inherit but can not be override

// class Parent{
//     final void show2(){
//         System.out.println("parent class another final method");
//     }
//     final void show1(){
//      System.out.println("parent class final method ");
//      }
// }
// class child extends Parent{
//     // @Override
//     // final void show1(){    ///it will throw compile time error cause here i'm tring to override final method
//     // }
//     void display(){
//         super.show1();
//         super.show2();
//     }
// }
// class polymorephism{
//     public static void main(String[] args) {
//         child c= new child();
//         c.show1();
//         c.show2();
//     }
// }

// 3. final class:- final class can not be extends-----------------------

// final class Parent{
// }
//  class child extends Parent{   // it will throw compile time error cause i'm tring to extend final class
// }