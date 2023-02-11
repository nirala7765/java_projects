
import java.util.Scanner;

public class practise_set_5 {
    public static void main(String[] args) {
/*
//        Question 1 : What will be the output of this program: 
        int a = 10;
         if (a==11)
           System.out.println("I am 11");
         else
           System.out.println("I am not 11");


 */

        /*

         //Question 2: Write a program to find out whether a student is pass or fail;
        // if it requires a total of 40% and at least 33% in each subject to pass.
        // Assume 3 subjects and take marks as input from the use
        String Name,address;
        int roll,phy,chem,math,total_gain;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        Name=sc.next();
        System.out.println("Enter Student roll number: ");
        roll=sc.nextInt();
        System.out.println("enter student Address:");
        address=sc.next();
        System.out.println("Enter physics Marks : ");
        phy=sc.nextInt();
        System.out.println("Enter Chemistry Marks : ");
        chem=sc.nextInt();
        System.out.println("Enter Math Marks : ");
        math=sc.nextInt();
        System.out.println("Enter Total full marks :");
       float Total=sc.nextInt();
        total_gain=phy+chem+math;
        float percentage = (total_gain * 100) / Total;
        System.out.println("Total marks gained: "+total_gain);
        System.out.println("Total marks percentage: "+percentage);
         if (percentage>=40 && phy>=33 && chem>=33 && math>=33){
             System.out.println("PASS");
         }else
             System.out.println("Fail");

         */
        //

        /*

//        Question 3 :Calculate income tax paid by an employee to the government as per the slabs mentioned below:
//        Income Slab	Tax
//        2.5L – 5.0L	5%
//        5.0L – 10.0L	20%
//        Above 10.0L	30%
        double income, tax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee Income in lac");
        income = sc.nextInt();
        if (income < 2.5) {
            tax = tax + 0;
        } else if (income > 2.5 && income <= 5.0) {
            tax = tax + (income - 2.5) * 0.05;

        } else if (income > 5.0 && income <= 10.0) {
            tax = tax + (5.0 - 2.5) * 0.05;
            tax = tax + (income - 5.0) * 0.2;

        } else {
            tax = tax + (5.0 - 2.5) * 0.05;
            tax = tax + (income - 5.0) * 0.2;
            tax=tax +(income-10.0)*0.3;

        }
        System.out.println("Total Tax payable over "+income+" lac is : "+tax+" lac");

         */

  //Question 4: Write a Java program to find out the day of the week given the number
        // [1 for Monday, 2 for Tuesday … and so on!]
/*
        //using if else condition

        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day Number  :");
        day=sc.nextInt();
        if (day==1)
            System.out.println("Monday");
        else if (day==2) {
            System.out.println("Tuesday");
        } else if (day==3) {
            System.out.println("Wednesday");
        } else if (day==4) {
            System.out.println("Thursday");
        } else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("Saturday");
        } else if (day==7) {
            System.out.println("Sunday");
        }else
            System.out.println("Enter valid Number of Day");



        //using Switch case

        int day;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of day :-");
        day = sc.nextInt();
        switch(day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3 :
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Enter valid number of day ");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter valid number of day");

 */
/*
        //Question 5:Write a Java program to find whether a year entered by the user is a leap year or not.

        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year:- ");
        year = sc.nextInt();
        if(year % 400 == 0){
            System.out.println("Given year is Leap year");
    } else if (year % 100 !=0 && year % 4==0) {
            System.out.println("The given year is a leap year ");

        }else
            System.out.println("given year is not a leap year");

 */


        /*
        //Question 6:Write a program to find out the type of website from the URL:
        //* .com – commercial website
        //* .org – organization website
        //* .in – Indian website

        String website;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the website :- ");
        website = sc.next();
        if (website.endsWith(".com")){
            System.out.println(website+" is commercial website");
        } else if (website.endsWith(".org")) {
            System.out.println(website+" is organizational website");
        } else if (website.endsWith(".in")) {
            System.out.println(website+" is indian website");

        }else
            System.out.println(website+" belongs to other category");

         */


        


    }
}
