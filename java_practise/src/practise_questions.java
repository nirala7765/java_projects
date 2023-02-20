import java.util.*;
import java.io.File;

import static java.lang.StrictMath.tan;

public class practise_questions {

    static  void count(String x){
        char [] ch = x.toCharArray();
        int letter = 0;
        int num=0;
        int space =0;
        int other =0;
        for (int i = 0;i<x.length();i++){
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;

            }
            else if (Character.isSpaceChar(ch[i])) {
                space++;

            }
            else{
                other++;
            }
        }
        System.out.println("The String is : Aa kiu, I swd skieo 236587. GH kiu: sieo?");
        System.out.println("letters: "+letter);
        System.out.println("Space: "+space);
        System.out.println("Digit: "+num);
        System.out.println("Others: "+other);
    }
    static double Distance_bw_lat_lon(double lat1,double lon1,double lat2,double lon2){
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        double earthRadius = 6371.01; //km
        return earthRadius*Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1-lon2));
    }

    static double areaOfPolygon(int n , int s){
        double Area1 ;
        Area1 = (n*s*s)/(4*tan(3.14/n));
        return Area1;
    }

    static  int SumDigit(int n){
        int sum1=0;
        while (n > 0) {
            sum1 = sum1+(n%10);
            n=n/10;
        }
        return sum1;
    }

    static  double areaOfHexagon(double s){
        double Area;
        Area = (6*s*s)/(4*tan(3.14/6));
        return Area;

    }
    public static void main(String[] args) {
        /*
        //problem1- swap 2 numbers
        int a = 4;
        int b= 6;
        System.out.println("Numbers before swap "+a + " and "+b);
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.println("Number after swap "+a+" and "+b);

         */

        //33. Write a Java program and compute the sum of the digits of an integer.

        //methods 1

//       int n,sum =0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        n= sc.nextInt();
//        for (int i=n;i>0;i++){
//           sum = sum + (n%10);
//           n=n/10;
//        }
//
//        System.out.println(sum);

        //method2

//        int x;
//       Scanner dc = new Scanner(System.in);
//        System.out.println("Enter the integer:");
//        x = dc.nextInt();
//        System.out.println("the sum of the integer is : "+SumDigit(x))


//34. Write a Java program to compute the area of a hexagon.


//        double S  ;
//        Scanner ac = new Scanner(System.in);
//        System.out.println("Enter the length of side of hexagon: ");
//        S = ac.nextDouble();
//        System.out.println("the Area of Hexagona is : "+areaOfHexagon(S));
        //Write a Java program to compute the area of a polygon.
//        int n , s;
//        Scanner fc = new Scanner(System.in);
//        System.out.println("Enter the number of side : ");
//        n = fc.nextInt();
//        System.out.println("Enter the length of Side : ");
//        s=fc.nextInt();
//        System.out.println("the area of polygon is : "+areaOfPolygon(n,s));


        //36. Write a Java program to compute the distance between two points on the surface of earth.

//        Scanner ks = new Scanner(System.in);
//        System.out.print("Input the latitude of coordinate 1: ");
//        double lat1 =ks.nextDouble();
//        System.out.print("Input the longitude of coordinate 1: ");
//        double lon1 = ks.nextDouble();
//        System.out.print("Input the latitude of coordinate 2: ");
//        double lat2=ks.nextDouble();
//        System.out.print("Input the longitude of coordinate 2: ");
//        double lon2 = ks.nextDouble();
//        System.out.print("The distance between those points is : "+Distance_bw_lat_lon(lat1,lon1,lat2,lon2));


        //problem reverse an integer
//        Scanner hc = new Scanner(System.in);
//        System.out.println("Enter the integer which yopu want to reverse : ");
//        int n = hc.nextInt();
//        int rev = 0;
//        while (n>0){
//            rev = rev*10+(n%10);
//            n= n/10;
//        }
//
//        System.out.println("Reverse Integer is: "+rev);
//

        //37 Write a Java program to reverse an Array.

//        int [] a = {2,6,8,7};
//        int l = a.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for (int i =0; i<n;i++){
//           temp = a[i];
//           a[i]=a[l-1-i];
//           a[l-1-i]=temp;
//
//
//        }
//        for (int element:a) {
//            System.out.println(element);
//
//        }

       //38.Write a java program to Reverse a String
//
//       Scanner St = new Scanner(System.in);
//        System.out.println("Enter the String:");
//        char [] letters = St.nextLine().toCharArray();
//        for (int i = letters.length-1;i>0;i--){
//            System.out.print(letters[i]);
//        }
//        System.out.println();


        //39.write a java program to count the char ,space, number and others
//        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
//        count(test);

        //40.Write a Java program to create and display unique three-digit number using 1, 2, 3, 4.
        // Also count how many three-digit numbers are there.
//         int amount =0;
//         for (int i =1;i<=4;i++){
//             for (int j =1;j<=4;j++){
//                 for (int k =1;k<=4;k++){
//                     if (k !=i && k !=j && i !=j){
//                         amount++;
//                         System.out.println(i + ""+j+""+k);
//                     }
//                 }
//             }
//         }
//        System.out.println("Total number of the three-digit is : "+amount);


        //problem -Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.

//        int n;
//        char s1,s2,s3;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number: ");
//        n= sc.nextInt();
//        System.out.printf("%d + %d%d + %d%d%d\n  ", n,n,n,n,n,n);
            //probmem-Write a Java program to find the size of a specified file.
//        System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
//        System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");

        //problem:-display system time
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());












    }
}
