package OOPS;

// --------------------------------------Abstract class-------------------------------------
// --------------------------------------Abstract class-------------------------------------
// --------------------------------------Abstract class-------------------------------------
// --------------------------------------Abstract class-------------------------------------

// points to be remmember:-

// 1. Abstract class must be declear with a Abstract keyword
// 2. An Abstract class can have Abstract method and no Abstract method and if we are using abstract method then we cant write their body
// 3. An Abstract class can have constructor and static method 
// 4. An Abstract method can have an final method that will force the sub class to not change the body of the method 
// 5. it can not be  instantiated.


// --------------------- 2. An Abstract class can have Abstract method and no Abstract method-----------
// abstract class Parent{
//     abstract void show();
//      void display(){
//         System.out.println("parent class method display");
//      }
// }
// class child extends Parent{
//     @Override
//     void show(){
//         System.out.println("child class method show");
//     }
//     @Override
//     void display(){
//         System.out.println("child class method display");
//     }
// }
// class Abstraction{
//     public static void main(String[] args) {
//         Parent p= new child();
//         p.display();
//         p.show();
//     }
// }


// -----------------------------An Abstract class can have constructor and static method--------------
abstract class Parent{
    Parent(){
        System.out.println("parent class abstract ");
    }
    static void show(){
        System.out.println("Parent class method");
    }
}
class child extends Parent{
    static void show(){
        System.out.println("child class method");
    }
}
class Abstraction{
    public static void main(String[] args) {
        Parent.show();
    }
}