public class practise_set_on_methods {
   //problem1
    static void table(int n){
        for (int i = 1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }

    }
    //problem2
    static void pattern(int n){
        for (int i =1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //problem3-sum of 1st n natural number using recursive function
    static int  sum_natural(int n){
        if (n==1){
            return 1;
        }
        return n + sum_natural(n-1);

    }

    //problem4-pattern in reverse;

    static void pattern1(int n){
        for (int i =n;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //problem 5 - fibonacci series
    static int fib(int n ){
      /*  if (n==1){
            return 0;
        } else if (n==2) {
            return 1;

        }
       */
        if (n==1 || n==2){
            return n-1;
        }
        else

            return fib(n-1)+fib(n-2);
    }


    //problem 6- write a method to find average of set of numbers that passed in arguments
    static float average(int ...arrays){
        int total = 0;
        float avg;
        for (int e:arrays) {
            total += e;
        }
        avg = total/arrays.length;
        return avg;
        }

        //


    public static void main(String[] args) {
        //table(7);                                             //problem1
       // pattern(11);                                          //problem2
//        int c = sum_natural(5);                               //problem3
//        System.out.println(c);
  //      pattern1(5);                                           //problem4
//        int f = fib(5);                                          //problem 5
//        System.out.println(f);

//        System.out.println(average(4,7,8,9));           //problem 6



    }
}
