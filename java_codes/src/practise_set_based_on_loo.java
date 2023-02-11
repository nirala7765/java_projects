public class practise_set_based_on_loo {
    public static void main(String[] args) {
      /*
        //Question 1: Write a program to print the following pattern :
        //****
        //
        //***
        //
        //**
        //
        //*
        //using while loop
       int i;
       for (i=4;i>0;i--){
           for (int j=1; j<=i;j++)
               System.out.print("*");
           System.out.println();
       }

       */

        /*
        //Question 2: Write a program to sum first n even numbers using a while loop.

        int n=5;
        int sum =0;
        int even;
        for (int i=1;i<=n;i++){
            even =2*i;
            System.out.println(even);
            sum=sum+even;
        }
        System.out.println("sum of 1st 5 even number is :- "+sum);

         */
        /*

        //Question 3: Write a program to print the multiplication table of a given number n.
        int n = 5;
        for (int j =1;j<=10;j++){
            System.out.println(n+" X "+j+" = "+n*j);
        }

         */

        /*

        //Question 4: Write a program to print a multiplication table of 10 in reverse order.
        int n=10;
        for (int j=10;j>0;j--){
            System.out.println(n+" X "+j+" = "+n*j);
        }

         */

        /*

        //Question 5: Write a program to find the factorial of a given number using for loops.
        int n,factorial;
        n=5;
        factorial=1;
        for (int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);

         */

        /*

        //Question 6: Repeat problem 5 using a while loop
        int n,i,fact;
        n=5;
        fact=1;
        i=1;
        while(i<=n){
            fact=fact*i;
            i++;

        }
        System.out.println(fact);

         */
        /*
        //Question 7: Repeat problem 1 using for/while loop.
        int i,j;
        i=4;
        j=1;
        while (i>0){
            while (j<=i){
                System.out.print("*");
                j++;
            }

            System.out.println();
            i--;
        }

         */
        /*
        //uestion 9: Write a program to calculate the sum of
        // the numbers occurring in the multiplication table of 8.
        int n = 5;
        int sum = 0;
        for (int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
            sum =sum + n*i;
        }
        System.out.println("the sum of table "+n+" is  "+sum);

         */
        //uestion 11: Repeat problem 2 using for loop.
        int i,even;
        int sum =0;
        int n =  5;
        for (i=1;i<=5;i++){
            even=2*i;
            System.out.println(even);
            sum = sum +even;
        }
        System.out.println("sum of 1st "+n+" even number is :- "+sum);
        
    }
}
