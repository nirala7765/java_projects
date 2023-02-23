
class Animals{
    String w;
    String e;

    public void setE(String E){
        this.e=E;
    }

    public String getE() {
        return e;
    }

    public void setW(String w) {
        this.w = w;
    }
    public String getW(){
        return w;
    }
}
class Dog extends Animals{
    String B;

    public void setB(String b){
        this.B=b;
    }
    public String getB(){
        return B;
    }

}








class Base{
    int X;

    public void setX(int x){
        this.X=x;
        System.out.println("I am Setting X for Base");
    }

    public int getX() {
        return X;
    }
    public void PrintMe(){
        System.out.println("I am a Constructor");

    }
}

class derived extends Base{
    int y;
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }
}
public class practise_inheritance {
    public static void main(String[] args) {

        //creating objects for Base class

        Base b = new Base();
        b.setX(9);
        System.out.println(b.getX());

        //Creating Objects for Derived Class

        derived d = new derived();
        d.setX(77);
        d.setY(65);
        System.out.println(d.getX());
        System.out.println(d.getY());


        //creating class for dong
        Dog d1 = new Dog();
        d1.setE("Dog can Eat");
        d1.setW("Dog can Walk");
        d1.setB("Dog Can Bark");
        System.out.println(d1.getE());
        System.out.println(d1.getW());
        System.out.println(d1.getB());



    }

}
