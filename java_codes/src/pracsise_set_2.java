import java.util.Scanner;

public class pracsise_set_2 {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        /*
       // 1.What will be the result of the following expression: float a = 7/4 * 9/2
        float a;
        a = 7/4.0f * 9/2.0f ;
        System.out.println(a);

         */

        /*
        //2. Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
       char  grade = 'B';
        System.out.println("grade after encrypting by 8");
        grade = (char)(grade+8);
        System.out.println(grade);
        System.out.println("After decrypting by 8");
        grade = (char) (grade-8);
        System.out.println(grade);

         */

        /*
        //3. Use comparison operators to find out whether a given number is greater than the user entered number or not.
         int b, A = 898;
        System.out.println("Enter your NUmber for comparison between by default number");
        b= dc.nextInt();
        if(b>A){
            System.out.println("yes " +b+" is greater than "+A);

        }else
            System.out.println("No "+b+ "is not greater than "+A);

         */

        /*
          //4Write the following expression in a java program: (v^2-u^2)/2as
        char v,u,a,s;
        double expression ;
        v  = 2;u=5;a=1;s=2;
        expression = (v*v-u*u)/2*a*s;
        System.out.println(expression);

         */

        //5. Find the value of 'a' in expression given below : int x = 7
        // int a = 7*49/7 + 35/7

        int a,x;
        x=7;
        a = x*49/x + 35/x;
        System.out.println(a);

    }
}
