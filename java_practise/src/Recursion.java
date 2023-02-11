public class Recursion {

    static int factorial(int n){
        if (n ==0 || n==1){
            return 1;
        }else

        {
          return n * factorial(n-1);
        }
    }
    static  int factorial_itrative(int x){
        if (x==0 || x==1){
            return 1;
        }else {
            int product =1;
            for (int i=1; i<=x; i++){
                product *=i;

            }
            return product;
        }

    }



    public static void main(String[] args) {
        int y= 5;
        System.out.println("factorial of y is : "+factorial(y));
        System.out.println("factorial of y is : "+factorial_itrative(y));

    }
}
