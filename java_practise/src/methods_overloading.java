public class methods_overloading {
 static void foo(){
     System.out.println("Good morning brother");
 }
 static void foo(int a){
     System.out.println("good morning "+a+" bro");
 }
 static void foo(int a, int b){
     System.out.println("good morning "+a+" bro");
     System.out.println("good morning "+b+" bro");
 }
 
    public static void main(String[] args) {
     foo();
     foo(500,800);
     foo(4000);

    }
}
