import java.util.Scanner;

public class Nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0]=65;
        marks[1]=85;
        marks[2]=45;
        marks[3]=75;
        marks[4]=55;
        boolean flag = true;
        while (flag){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ArrayIndex: ");
            int ind = sc.nextInt();
            try{
                System.out.println("You can proceed further");
                try{
                    System.out.println("Value at Index "+ind+" is "+marks[ind]);
                    flag = false;
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry your input index is out of Bound ReEnter index:");
                    System.out.println("Exception in internal ");
                }
            }catch (Exception e){
                System.out.println("Exception outside");
            }
            }
        System.out.println("Program Executed Successfully");


    }
}
