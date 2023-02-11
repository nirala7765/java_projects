public class varags {


    static int sum(int ...arr){
        int result = 0;
        for (int a: arr) {
            result+=a;

        }
        return result;
    }

    static int sum2(int x,int ...array){
        int result2 = x;
        for (int b:array) {
            result2 +=b;

        }
        return result2;
    }
    public static void main(String[] args) {
        System.out.println("the sum of nothing is : "+sum());
        System.out.println("the sum of 3 and 5 is : "+sum(3,5));
        System.out.println("the sum of 4,3 and 5 is : "+sum(4,3,5));
        System.out.println("the sum of 9,4,3 and 5 is : "+sum(9,4,3,5));
        System.out.println("print sum2 here after");
        System.out.println("the sum of 1 is : "+sum2(1));
        System.out.println("the sum of 3 and 5 is : "+sum2(3,5));
        System.out.println("the sum of 4,3 and 5 is : "+sum2(4,3,5));
        System.out.println("the sum of 9,4,3 and 5 is : "+sum2(9,4,3,5));

    }

}
