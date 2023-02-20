class NewEmployee{
    private int id;
    private String name;
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
}


public class commodification {
    public static void main(String[] args) {
        NewEmployee rajesh = new NewEmployee();
      rajesh.setId(45);
      rajesh.setName("Rajesh Thakur");
        System.out.println(rajesh.getId());
        System.out.println(rajesh.getName());


    }
}
