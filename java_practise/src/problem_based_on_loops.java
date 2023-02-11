import java.util.*;
public class problem_based_on_loops {
    public static void main(String[] args) {
        //1.Write a program to print numbers from 1 to 10.
        //using for loop
//        for (int i=1;i<=10;i++){
//            System.out.println(i);
 //           }
        //using while loop
//        int i =1;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }
        //using do while loop
//        int i =1;
//        do {
//            System.out.println(i);
//            i++;
//        }while(i<=10);

          //2.Write a program to calculate the sum of first 10 natural number.
//        int n=10;
//        int sum=0;
//        for (int i=1;i<=n;i++){
//            System.out.println(i);
//            sum = sum + i;
//
//        }
//        System.out.println("sum of 1st "+n+" natural number is :- "+sum);
        //using while loop
//        int n =10;
//        int sum =0;
//        int i=1;
//        while(i<=n){
//            System.out.println(i);
//            sum =sum+i;
//            i++;
//
//        }
//        System.out.println("the sum of 1st "+n+" natural number is :- "+sum);
        //using do while loop
//        int i=1,n=10,sum =0;
//        do {
//            System.out.println(i);
//            sum =sum+i;
//            i++;
//        }while(i<=n);
//        System.out.println("sum is "+sum);

        //Write a program that prompts the user to input a positive integer.
        // It should then print the multiplication table of that number.
//       int n,i;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number for which you want to print the table: ");
//        n=sc.nextInt();
//        for (i=1;i<=10;i++){
//            System.out.println(n+" X "+i+" = "+n*i);
//        }
           //4.Write a program to find the factorial value of any number entered through the keyboard.
//        int n,fact=1,i;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number for which you find the factorial:- ");
//        n=sc.nextInt();
//        for (i=1;i<=n;i++){
//            fact = fact*i;
//        }
//        System.out.println("factorial of "+n+" is :- "+fact);

        //5.Two numbers are entered through the keyboard. Write a program
        // to find the value of one number raised to the power of another.
        // (Do not use Java built-in method)
//        int base,power,result=1;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the base:- ");
//        base=sc.nextInt();
//        System.out.println("enter the power :- ");
//        power=sc.nextInt();
//        for (int i=1;i<=power;i++){
//           // result=result*base;
//            result *= base;
//        }
//
//        System.out.println("Result = "+result);

        //6.Write a program that prompts the user to input an integer and then outputs the number with the digits
        // reversed. For example, if the input is 12345, the output should be 54321.
//        int n ,reverse=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the numbers:-");
//        n=sc.nextInt();
//        while(n>0){
//            reverse=(reverse*10)+n%10;
//            n=n/10;
//        }
//        System.out.println("Reverse = "+reverse);

        //7.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

//        int n, digit,even_sum=0,odd_sum=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number :- ");
//        n=sc.nextInt();
//        while (n>0){
//            digit = n%10;
//            if (digit % 2==0){
//                even_sum =even_sum + digit;
//            }else
//                odd_sum = odd_sum + digit;
//            n=n/10;
//        }
//        System.out.println("sum of even numbers:- "+even_sum);
//        System.out.println("sum of odd numbers:- "+odd_sum);

        //8.Write a program that prompts the user to input a positive integer. It should then output a message indicating
        // whether the number is a prime number.
//        int n,count =0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number for which you want to check:-");
//        n=sc.nextInt();
//        for (int i=2;i<=n;i++) {
//            if (n % i == 0) {
//                count++;
//            }
//        }
//            if (count > 2 && n > 1 )
//                System.out.println(n+" is not a  prime ");
//            else
//                System.out.println(n+" is a prime ");

        

        }
    }

