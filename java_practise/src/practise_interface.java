
interface car{

    int speed_limit = 80;
    void breaking(int Decrement);
    void Accelrtaing(int Increment);


}

interface carPolicy{

    void insurance();
    void puc();
    void Rc();
}


class hondaCity implements car , carPolicy{

    @Override
    public void breaking(int Decrement) {
        System.out.println("Applying Break for Stop the car");
    }

    @Override
    public void Accelrtaing(int Increment) {
        System.out.println("Apply Accelerator to boost the speed ");
    }

    @Override
    public void insurance() {
        System.out.println("You car must have valid Insurance paper ");
    }

    @Override
    public void puc() {
        System.out.println("your car must have Valid Pollution under Control certificate");
    }

    @Override
    public void Rc() {
        System.out.println("your must have registered with Indian Government transport Department and have valid Registration card ");
    }
}

public class practise_interface {
    public static void main(String[] args) {

        hondaCity mycar = new hondaCity();
        mycar.Accelrtaing(2);
        mycar.breaking(4);
        mycar.insurance();
        mycar.puc();
        mycar.Rc();
        System.out.println("Your car maximum speed in city should be : "+mycar.speed_limit);


    }

}
