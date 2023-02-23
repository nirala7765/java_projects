

 abstract class Mobile{
    public Mobile(){

    }
        public void Say(){
            System.out.println("I am your Smartphone");
        }
    abstract  public void SwitcOn();
    abstract public void PlayMusic();
    abstract public void playVedio();
    abstract public void PlayGames();
    abstract public void MakeCall();
 }


 class Realme extends Mobile{

    public void myphone(){
        System.out.println("i am from Realme");
    }
     @Override
     public void SwitcOn() {
         System.out.println("Realme is Switching On");
     }

     @Override
     public void PlayMusic() {
         System.out.println("realme is playing Music");
     }

     @Override
     public void playVedio() {
         System.out.println("Realme is playing Vedio");
     }

     @Override
     public void PlayGames() {
         System.out.println("Realme is Playin games");
     }

     @Override
     public void MakeCall() {
         System.out.println("Realme is Making call to you Friend");
     }
 }

class Samsung extends Realme{

    @Override
    public void myphone(){
        System.out.println("i am from Samsung");
    }
    @Override
    public void SwitcOn() {
        System.out.println("Samsung is Switching On");
    }

    @Override
    public void PlayMusic() {
        System.out.println("Samsung is playing Music");
    }

    @Override
    public void playVedio() {
        System.out.println("Samsung is playing Vedio");
    }

    @Override
    public void PlayGames() {
        System.out.println("Samsung is Playin games");
    }

    @Override
    public void MakeCall() {
        System.out.println("Samsung is Making call to you Friend");
    }



}






public class Practise_onAbstract_class {
    public static void main(String[] args) {

        Samsung sc = new Samsung();
        sc.Say();
        sc.myphone();
        sc.MakeCall();

        sc.PlayGames();
        sc.PlayMusic();
        sc.SwitcOn();
        sc.playVedio();


        Realme rc = new Realme();
        rc.MakeCall();
        rc.PlayGames();
        rc.playVedio();
        rc.playVedio();




    }
}
