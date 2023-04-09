
class mythr1 extends Thread{
    public mythr1(String name){
        super(name);
    }

    public void run() {
       // while (true) {
            System.out.println("I am Thread : ");
        //}
    }
}




public class Thread_constructor {
    public static void main(String[] args) {
        mythr1 t1 = new mythr1("Raghu");
        mythr1 t2 = new mythr1("Satish");
        t1.start();
        System.out.println("Thread1 id is :  "+t1.getId());
        System.out.println("Thread Name is : "+t1.getName());
        t2.start();
        System.out.println("Thread1 id is :  "+t2.getId());
        System.out.println("Thread Name is : "+t2.getName());

    }
}
