import java.util.*;

import static java.lang.StrictMath.tan;

public class practise_questions {

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
        Scanner ks = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double lat1 =ks.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double lon1 = ks.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double lat2=ks.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double lon2 = ks.nextDouble();
        System.out.print("The distance between those points is : "+Distance_bw_lat_lon(lat1,lon1,lat2,lon2));









    }
}
