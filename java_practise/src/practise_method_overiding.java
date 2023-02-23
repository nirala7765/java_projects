class Amar{
    public int wife(){
        return 2;
    }

    public void wife1(){
        System.out.println("I am Amar's  wife1");
    }

    public void ruby(){
        System.out.println(" I am Amar's  wife2 ");
    }
}

class Arun extends Amar{


@Override
    public void ruby(){
        System.out.println(" I am Wife of Amar But Bhavi of Arun  ");
    }

    public  void prity(){
        System.out.println(" I am Arun's wife ");
    }
}




public class practise_method_overiding {

    public static void main(String[] args) {

//        Amar a = new Amar();
//        a.ruby();


        Arun b = new Arun();
        b.ruby();

    }
}
