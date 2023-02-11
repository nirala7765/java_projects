import javax.naming.Name;
import java.util.Scanner;

public class first_practise_set {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        /*
        //1. Write a program to sum three numbers in Java.
        int a,b,c;
        a=10;
        b=25;
        c=50;
        int sum=0;
        sum = a+b+c;
        System.out.println("sum of 3 numbers = "+sum);

         */

        /*
        //2.2. Write a program to calculate CGPA using marks of three subjects (out of 100)
        int sub1, sub2,sub3,total_gain,Total=300;
        double percentage,cgpa;
        String Name;
        int Roll_number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student Name:");
        Name = sc.nextLine();
        System.out.println("Enter Student Roll NUmber");
        Roll_number=sc.nextInt();
        System.out.println("Enter student DOB");
        String dob = sc.next();
        System.out.println("Enter Student Address");
        String  Address=sc.next();
        System.out.println("Enter Student Subject1 Marks");
        sub1=sc.nextInt();
        System.out.println("Enter Student Subject2 Marks");
        sub2= sc.nextInt();
        System.out.println("Enter Student Subject3 Marks");
        sub3= sc.nextInt();
        total_gain = sub1+sub2+sub3;
        System.out.println("Total Gained Marks = "+total_gain);
        percentage = (total_gain*100)/Total;
        System.out.println("Percentage = "+percentage);
        cgpa = percentage/10;
        System.out.println("CGPA = "+cgpa);

         */
        /*
         //3.3. Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
           String Name;
        System.out.println("Enter your Nmae:");
        Name = dc.next();
        System.out.println("Hello "+Name +" have a good day");

         */
        /*
         //4. 4. Write a Java program to convert Kilometers to miles.
        double Kilometers,miles;
        System.out.println("Enter distance in to Km : ");
        Kilometers = dc.nextDouble();
        miles  =  Kilometers/1.60934;
        System.out.println(Kilometers + " km = "+miles + " miles");

         */
       // 5.5. Write a Java program to detect whether a number entered by the user is an integer or not.
        System.out.println("Enter the number ");
        System.out.println(dc.hasNextInt());



    }
}
