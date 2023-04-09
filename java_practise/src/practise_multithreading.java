
class ThreadChattinWithSahiti extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<400) {
            System.out.println("I am chatting with Sahiti");
            System.out.println("And Felling very happy to chat with her");
            i++;
        }
    }
}

class ThreadChattingWithPriti extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<400) {
            System.out.println("I am Replying to Prity on whatsapp ");
            System.out.println("But i am felling Stressed");
            i++;
        }
    }

}

class ThreadChattingWithPriya extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<400) {
            System.out.println("I am Talking to priya ");
            System.out.println("And  i am felling very Thankful");
            i++;
        }
    }

}








public class practise_multithreading {

    public static void main(String[] args) {
        ThreadChattinWithSahiti cht1 = new ThreadChattinWithSahiti();
        ThreadChattingWithPriti cht2 = new ThreadChattingWithPriti();
        ThreadChattingWithPriya cht3 = new ThreadChattingWithPriya();
        cht1.start();
        cht2.start();
        cht3.start();
    }
}
