import java.util.Scanner;

public class HandlingSpecificException {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0]=55;
        marks[1]=85;
        marks[2]=75;
        marks[3]=55;
        marks[4]=65;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array index : ");
        int ind = sc.nextInt();
        System.out.println("Enter the number by which you want to divide : ");
        int number = sc.nextInt();

        try{
            System.out.println("The value of Enter index is : "+ind);
            System.out.println("The value After Division : " +marks[ind]+"/"+number+" = "+marks[ind]/number);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException occurred");
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred");
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Some Other Exception occurred!");
            System.out.println(e);
        }



    }
}
