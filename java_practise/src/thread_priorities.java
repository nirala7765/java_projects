

class Mythr22 extends Thread{
    public Mythr22(String name){
        super(name);
       while (true){
           System.out.println(this.getName()+" is Running");
      }
    }
}
public class thread_priorities {
    public static void main(String[] args) {
      Mythr22 t1 = new Mythr22("Ravish");
      Mythr22 t2 = new Mythr22("Lavish");
      Mythr22 t3 = new Mythr22("sonu");
      Mythr22 t4 = new Mythr22("Ramu");
      Mythr22 t5 = new Mythr22("love");
      t5.setPriority(Thread.MAX_PRIORITY);
      t1.setPriority(Thread.MIN_PRIORITY);
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      t5.start();
    }
}
