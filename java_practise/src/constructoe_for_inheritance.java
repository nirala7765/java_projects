

class Base1{
     Base1(){
         System.out.println("I am a Base class Constructor");

     }
     Base1(int a){
         System.out.println("i am a Base class overloaded Constructor with Value a : "+a);
     }
}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("i am a derived class constructor ");
    }
    Derived1(int a,int b){
        super(a);
        System.out.println("i am a overloaded derived class constructor with value b : "+b);
    }
}
class childOfDerived1 extends Derived1{
    childOfDerived1(){
        System.out.println("i am a constructor of childDerived1 ");
    }
    childOfDerived1(int a, int b,int c){
        super(a,b);
        System.out.println("i am a childDerived1 Overloaded constructor with value c : "+c);
    }
}

public class constructoe_for_inheritance {
    public static void main(String[] args) {
       childOfDerived1 d1 = new childOfDerived1(55,76,82);

    }
}
