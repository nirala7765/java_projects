class MythreadRunable1 implements Runnable{
    public void run(){
        int i =0;
        while(i<400 ){
            System.out.println(" Hello guys  I am a thread 1 ");
            i++;
        }

    }
}
class MythreadRunable2 implements Runnable{
    public void run(){
        int i =0;
        while(i<400 ){
            System.out.println(" Hello guys  I am a thread 2 ");
            i++;
        }

    }
}


public class Thread_Reunable {
    public static void main(String[] args) {
      MythreadRunable1 bullet1 = new MythreadRunable1();
      Thread gun1 = new Thread(bullet1);
      MythreadRunable2 bullet2 = new MythreadRunable2();
      Thread gun2 = new Thread(bullet2);
      gun1.start();
      gun2.start();
    }
}
