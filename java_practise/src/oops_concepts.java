
 class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My employeee id is : "+id);
        System.out.println("My Name is : "+name);
    }

    public void getsalary(){
        System.out.println("Salary : "+salary);
    }
}
public class oops_concepts {
    public static void main(String[] args) {
        Employee kishan = new Employee();
        kishan.id = 3526;
        kishan.salary=25000;
        kishan.name = "Ishan kishan";
        kishan.printDetails();
        kishan.getsalary();





    }
}
