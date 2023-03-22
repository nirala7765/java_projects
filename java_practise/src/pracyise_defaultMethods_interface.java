

interface MyCamera{
    void takeSnap();
    void RecordVideo();

    default void recordReels() {
        System.out.println("recording Reels");
        StopRec();
    }

    private void StopRec(){
        System.out.println("Stop Recording Reels Now");
    }

}

interface WifiNetworks{

    String[] NetworkLists();
}

class CellPhone2{
    public void MakeCall(String numbers){
        System.out.println("making Call to my friends : "+numbers);
    }
    public void PeakCall(){
        System.out.println("Connecting......");
    }
}


class MySmartPhone2 extends CellPhone2 implements MyCamera ,WifiNetworks{

    @Override
    public void takeSnap() {
        System.out.println("taking Snapshot");
    }

    @Override
    public void RecordVideo() {
        System.out.println("recording Video in 4k Resolution");
    }

    @Override
    public String[] NetworkLists() {
      String [] networklists = {"Amar_wifi","Dont Connect","hostelWife"};
      return networklists;
    }
}


public class pracyise_defaultMethods_interface {
    public static void main(String[] args) {

        MySmartPhone2 ms2 = new MySmartPhone2();
        String [] networks = ms2.NetworkLists();
        for (String items : networks) {
            System.out.println(items);
        }
        ms2.recordReels();
        ms2.RecordVideo();
        ms2.takeSnap();
        ms2.MakeCall("7765011865");
        ms2.PeakCall();

    }
}
