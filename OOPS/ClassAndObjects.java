package OOPS;
 
// There are three ways to Initialize an objects

// 1---------------------By refering Variable-----------------/
class ByReferingVariable{
    int id;
    String username="";
}
class InitializingThrowTheMethod{
    int id2;
    String name2="";
    void show(int id2,String name2){
        this.id2=id2;
        this.name2=name2;
    }
}
public class ClassAndObjects {
    public static void main(String[] args) {
        ByReferingVariable b= new ByReferingVariable();
        b.id=11192732;
        b.username="Prince sainger";     
        System.out.println("by refering variables "+b.id);          
        System.out.println("by refering variable "+b.username);

        
    }
}
