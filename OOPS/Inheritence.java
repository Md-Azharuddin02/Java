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
public class Inheritence {
    public static void main(String[] args) {
        // Two t= new Two();          // This is single Inheritence
        // t.show();                 //This is single Inheritence
        // t.showagain();            //This is single Inheritence

        // -----------------------------------------------------
        //Three t=new Three();          //This is multilevel Inheritence       
        //t.show();                    //This is multilevel Inheritence 
       // t.showagain();               //This is multilevel Inheritence 
        //t.showThree();               //This is multilevel Inheritence 
        // ---------------------------------------------------------
        A a = new A();              // Hirarichal Inheritence
        a.show();
        a.showA();

        B b= new B();               // Hirarichal Inheritence
        b.show();
        b.showB();

        C c= new C();
        c.show();                   // Hirarichal Inheritence
        c.showC();


    }
}
