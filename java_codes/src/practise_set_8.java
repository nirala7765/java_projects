class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void SetName(String n){
        name = n;
    }
}

class MobilePhone{
    String ring;
    String vib;
    String sil;

    public static void Ring(){
        System.out.println("Phone is Ringing");

    }
    public static void vibrate(){
        System.out.println("Phone is vibrating");
    }
}
class square{
    int side;
    public int  area(){
        return side*side;

    }

    public int perimeter(){
        return 4*side;
    }
}

class rectangle{
    int lOfRec;
    int wOfRec;
    public int areaOfRec(){
        return lOfRec*wOfRec;
    }
    public int perimeterOfRec(){
        return 2*(lOfRec + wOfRec);
    }
}
class TommyVecetti{
    public void run(){
        System.out.println("Player is Running from the enemy");
    }
    public void hit(){
        System.out.println("Player is Hitting the Enemy");
    }
    public void fire(){
        System.out.println("Player is Firing on enemy");
    }
}

class circle{
    int radius;
    public double AreaOfCircle(){
        return 3.14*radius*radius;
    }
    public double CircumferenceOfCircle(){
        return 2*3.14*radius;
    }
}
public class practise_set_8 {
    public static void main(String[] args) {
        //problem1
//        Employee rajeev = new Employee();
//        rajeev.name="Rajeev Ranjan Kumar";
//        rajeev.salary=25000;
//        rajeev.getName();
//        rajeev.getSalary();
//        System.out.println(rajeev.getName());
//        System.out.println(rajeev.getSalary());
//       rajeev.SetName("Rajeev Ranjan");
//        System.out.println(rajeev.getName());
//
        //problem2
//        MobilePhone phone = new MobilePhone();
//        phone.ring="The Phone is Ringing";
//        phone.vib = "The Phone is  Vibrating";
//        System.out.println(phone.ring);
//          MobilePhone.Ring();
//          MobilePhone.vibrate();

        //problem3
//        square sq = new square();
//        sq.side=6;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        //problem4

//       rectangle rec = new rectangle();
//       rec.wOfRec=5;
//       rec.lOfRec=9;
//        System.out.println(rec.areaOfRec());
//        System.out.println(rec.perimeterOfRec());

        //problem5
//        TommyVecetti player1 = new TommyVecetti();
//        player1.fire();
//        player1.hit();
//        player1.run();


        //problem6

        circle c = new circle();
        c.radius=5;
        System.out.println("Area of Circle is : "+c.AreaOfCircle());
        System.out.println("Circumference of Circle is : "+c.CircumferenceOfCircle());





    }
}
