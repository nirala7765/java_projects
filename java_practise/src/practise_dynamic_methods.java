
 class Phone{
    public void showtime(){
        System.out.println("Showing Time");

     }

     public void on(){
         System.out.println("Phone is Switchin On......");
     }


 }

  class smartphone extends Phone{
    public void music(){
        System.out.println("Music Playing");
    }

    public void on(){
        System.out.println("SmartPhone is witching On.....");
    }
  }

public class practise_dynamic_methods {

    public static void main(String[] args) {

        Phone mydevice = new smartphone();

        mydevice.showtime();
        mydevice.on();
       // mydevice.music();


    }
}
