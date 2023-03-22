
interface TvRemote{
    void  Volume();
    void ChangeChannels();

    }

interface SmartTvRemote extends TvRemote{
    void VoiceCommand();
    void  BrowsingButton();
}

class Tv implements SmartTvRemote{
     public void TvButtons(){
         System.out.println("It will Use when Remote is Not Working ");
     }
    @Override
    public void Volume() {
        System.out.println("This Key is used for Increase and Decrease Volume ");
    }

    @Override
    public void ChangeChannels() {
        System.out.println("This is use To Change the Channels");
    }

    @Override
    public void VoiceCommand() {
        System.out.println("This Button use to Active Voice Command using Smart Remote");
    }

    @Override
    public void BrowsingButton() {
        System.out.println("This Button use to Browse the Internet ");
    }
}



abstract class Telephone{
    abstract void Ring();
    abstract void lift();
    abstract void disconnect();

}

class SmartTelephone extends Telephone{

     public void PlayingMusic(){
         System.out.println("playing Music in SmartPhones........");
     }
    @Override
    void Ring() {
        System.out.println("SmartPhone is Ringing.....");
    }

    @Override
    void lift() {
        System.out.println("Peaking the call......");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting the call.......");
    }
}




interface  BasicAnimals{
    void eat();
    void sleep();
}
class Monkey{
    public void Jump(){
        System.out.println("Monkey is Jumping on the tree ");
    }
    public void Bite(){
        System.out.println("monkey can Bite if Human will Disturb Them ");
    }
}

class Humans extends Monkey implements BasicAnimals{

    public void Feeding(){
        System.out.println("Human is fedding those monkeys");
    }

    @Override
    public void eat() {
        System.out.println("Everyone is Eating For life");
    }

    @Override
    public void sleep() {
        System.out.println("Slepp is very Important to be fresh and Energetic ");
    }
}





abstract class Pen{
    abstract void Write();
     abstract void refill();
}

class Fountain extends Pen{

    void ChangeNib(){
        System.out.println("Change the Nib After Empty");
    }
    @Override
    void Write() {
        System.out.println("It is use to write anyThings");
    }

    @Override
    void refill() {
        System.out.println("Refill this pen to Reuse ");
    }
}

public class Practise_set_chapter_11 {
    public static void main(String[] args) {


        //Problem 2
//
//        Fountain fnpen = new Fountain();
//        fnpen.Write();
//        fnpen.refill();
//        fnpen.ChangeNib();



        //problem3

//        Humans hm = new Humans();
//        hm.Feeding();
//        hm.eat();
//        hm.sleep();
//        hm.Jump();
//        hm.Bite();

        //problem5  Demonstrating Polymorphism using 3 question

//        Monkey mon1 = new Humans();
//        mon1.Bite();
//        mon1.Jump();
//       // mon1.Feedin();throws error bcoz reference is monkey does not  have Feeding Methods
//       BasicAnimals ban1 = new Humans();
//       ban1.eat();
//       ban1.sleep();
      // ban1.Bite(); it throws error bcoz reference is BasicAnimals and Bite() methods is not available in Basic-animals


        //problem4  Demonstrating Polymorphism
//
//        Telephone tp = new SmartTelephone();
//        tp.Ring();
//        tp.lift();
//        tp.disconnect();
        // tp.PlayinMusic(); It will throw Error bcoz This method not exist in Telephone

        // this refrence can acess all methods bcoxz its Exist all methods bcox classes is inheriting
//        SmartTelephone smt = new SmartTelephone();
//        smt.PlayingMusic();
//        smt.Ring();
//        smt.lift();
//        smt.disconnect();

        //Problem6 and 7
        Tv mytv = new Tv();
        mytv.Volume();
        mytv.ChangeChannels();
        mytv.VoiceCommand();
        mytv.BrowsingButton();
        mytv.TvButtons();


    }
}
