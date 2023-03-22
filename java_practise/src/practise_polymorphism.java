import java.util.Arrays;

interface MyCamera2{
    void TakeSapShot();
    void recordVideo();
}
interface  getWifiNetworks {
    String[] WifiLisdts();
}

class Mycellphon2{
    public void Makecall(){
        System.out.println("making Call....");
    }
}

class Mysmartphone3 extends Mycellphon2 implements MyCamera2,getWifiNetworks{

    @Override
    public void TakeSapShot() {
        System.out.println("Taking Snapshot");
    }

    @Override
    public void recordVideo() {
        System.out.println("recording Vedio");
    }

    @Override
    public String[] WifiLisdts() {
           String[] Networllists = {"dlink","Airtelwifi","jioWire"};
        return Networllists;
    }
}

public class practise_polymorphism {
    public static void main(String[] args) {

        MyCamera2 mycam2 = new Mysmartphone3();  //using this samrtphone as a camera

        // mycam2.Makecall();--> Not allowed this methods bcoz use smartphone only for camera
       // mycam2.WifiLisdts();--> not allowed to use  network

        //these are Mycamera2 methods or functions so ,it can be used
        mycam2.TakeSapShot();
        mycam2.recordVideo();


        //for use all methods make object for smartphone

        Mysmartphone3 msp2 = new Mysmartphone3();
        msp2.WifiLisdts();
        String[] Networkslis = msp2.WifiLisdts();
        for (String item : Networkslis) {
            System.out.println(item);

        }

        msp2.Makecall();
        msp2.TakeSapShot();
        msp2.recordVideo();

    }
}
