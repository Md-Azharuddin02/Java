package OOPS;
 
// There are three ways to Initialize an objects

// 1---------------------By refering Variable-----------------/
class ByReferingVariable{
    int id;
    String username="";
}
public class ClassAndObjects {
    public static void main(String[] args) {
        ByReferingVariable b= new ByReferingVariable();
        b.id=11192732;
        b.username="Prince sainger";
        System.out.println(b.id);
        System.out.println(b.username);
    }
}
