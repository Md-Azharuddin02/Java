package OOPS;

// ---------------------Single Inheritence----------------
class One{
    void show(){
        System.out.println("This is the parent classs method");
    }
}
class Two extends One{
    void showagain(){
        System.out.println("This is the secound class method ");
    }
}


// -------------------Multilevel Inheritence----------------------
class Three extends Two{
    void showThree(){
        System.out.println("This is three class method");
    }
}

// -----------------------Hirarichal Inheritence-------------------
class A extends One{
    void showA(){
        System.out.println("This is A class method");
}
}
class B extends One{
    void showB(){
        System.out.println("This is B class method");
    }
}
class C extends One{
    void showC(){
        System.out.println("This C class method ");
    }
}
// -----------------------Hybride Inheritence-----------------------
class GrandFather{
    void grandFather(){
        System.out.println("This is the grand father class object ");
    }
}
class Son1 extends GrandFather{
    void son1(){
        System.out.println(" This is Son1 class method");
    }
}
class Son2 extends GrandFather{
    void son2(){
        System.out.println("This is son2 class method");
    }
}
class Son1_Son1 extends Son1{
    void son1_Son1(){
        System.out.println("This is Son1_Son1 class method");
    }
}
class Son1_Son2 extends Son1{
    void son1_Son2(){
        System.out.println("This is Son1_son2 class method");
    }
}
class Son1_Son3  extends Son1{
    void son1_Son3(){
        System.out.println("This is Son1_son3 class method");
    }
}

class Son2_Son1 extends Son2{
    void son2_Son1(){
        System.out.println("This is Son2_son1 class method");
    }
}
class Son2_Son2 extends Son2{
    void son2_son2(){
        System.out.println("This is Son2_son2 class method ");
    }
}
class Son2_Son3 extends Son2{
    void son2_Son3(){
        System.out.println("This is son2_son3 class method ");
    }
}
public class Inheritence {
    public static void main(String[] args) {
        Two t= new Two();          // This is single Inheritence
        t.show();                 //This is single Inheritence
        t.showagain();            //This is single Inheritence

        // -----------------------------------------------------
       Three t1 =new Three();          //This is multilevel Inheritence       
       t1.show();                    //This is multilevel Inheritence 
       t1.showagain();               //This is multilevel Inheritence 
       t1.showThree();               //This is multilevel Inheritence 
        // ---------------------------------------------------------
       A a = new A();              // Hirarichal Inheritence
       a.showA();
       a.show();

       B b= new B();               // Hirarichal Inheritence
       b.show();
       b.showB();

       C c= new C();
       c.show();                   // Hirarichal Inheritence
       c.showC();
           // ------------------------------------------------------------------

// ---- ----------son1- children--------
        Son1_Son1 s1_s1= new Son1_Son1();             // Hybride inheritence
        s1_s1.grandFather();                         //grandparent
        s1_s1.son1();                               //son
        s1_s1.son1_Son1();                         //grandson


        Son1_Son2 s1_s2= new Son1_Son2();           //hybride inderitence
        s1_s2.grandFather();
        s1_s2.son1();
        s1_s2.son1_Son2();


        Son1_Son3 s1_s3= new Son1_Son3();           //Hybride inheritence
        s1_s3.grandFather();
        s1_s3.son1();
        s1_s3.son1_Son3();

// ---------------------Son2-Children---------------------
        Son2_Son1 s2_s1= new Son2_Son1();       //Hybride inheritence
        s2_s1.grandFather();
        s2_s1.son2();
        s2_s1.son2_Son1();


        Son2_Son2 s2_s2= new Son2_Son2();           //Hybride interface
        s2_s2.grandFather();
        s2_s2.son2();
        s2_s2.son2_son2();

        Son2_Son3 s2_s3= new Son2_Son3();
        s2_s3.grandFather();
        s2_s3.son2();
        s2_s3.son2_Son3();



















































    }
}
