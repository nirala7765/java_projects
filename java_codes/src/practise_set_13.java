
class Practise13 extends Thread{
    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }catch (InterruptedException e ){
                throw new RuntimeException(e);
            }

            System.out.println("Good Morning");
        }
    }
}
class Practise13B extends Thread{
   @Override
    public void run(){
        while (true){
            System.out.println("Welcome");

            try {
                 Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class practise_set_13 {
    public static void main(String[] args) {
        //problem1
        Practise13 p1= new Practise13();
        Practise13B p2 = new Practise13B();
        //problem3
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        //problem4
        System.out.println(p1.getState());
        //problem5
        System.out.println(Thread.currentThread().getState());
        p1.start();
        p2.start();








    }
}
