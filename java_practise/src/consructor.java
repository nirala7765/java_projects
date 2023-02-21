class myemployee {
    int id;
    String name;
    int salary;

    public myemployee(){
        id=45;
        name="sambhu";
    }
    public myemployee(String na ,int i){
        name=na;
        id=i;

    }
    public myemployee(int Salary){
        salary=Salary;
    }

//    public void setId(int i) {
//        this.id=i;
//
//    }
//
//    public int getId() {
//        return id;
//    }
//    public void setName(String n){
//        this.name=n;
//    }
//    public String getName(){
//        return name;
//    }
}



public class consructor {
    public static void main(String[] args) {
       // myemployee amar = new myemployee();
       myemployee amar = new myemployee("Rajesh",36);
       myemployee satish = new myemployee(10000);

        //modifier
//       amar.setId(55);
//       amar.setName("Vikash Rajput");
//        System.out.println(amar.getId());
//        System.out.println(amar.getName());
        System.out.println(amar.name);
        System.out.println(amar.id);
        System.out.println(satish.salary);

    }
}
