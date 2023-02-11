import java.util.Arrays;
public class array_practise {
    public static void main(String[] args) {
/*
        int [] marks ; //declaration
        marks = new int[5];  //memory allocation
        marks[0]= 90;
        marks[1]= 100; // initialization
        marks[2]= 80;
        marks[3]= 60;
        marks[4]= 50;
        System.out.println(marks[4]);


        int marks1[] = new int[5];//declaration and memory allocation
        marks1[2]= 55;
        System.out.println(marks1[2]);


        int[] marks2 = {100,60,96,88,50,70};      //Declare +initalization
       // System.out.println(marks2[3]);
       // System.out.println(marks2[4]);
        System.out.println("array display using for loop");
        for (int i =1;i< marks2.length;i++)   //display array using for loop or array traversal
            System.out.println(marks2[i]);
        System.out.println(marks2.length);
        System.out.println("array display using for loop in reverse order");
        for (int i =marks2.length-1; i>=0;i--)  //in reverse order
            System.out.println(marks2[i]);
        System.out.println("array display using for each loop");
        for (int element : marks2 ) {

            System.out.println(element);
        }
        String [] students ={"lavesh","raish","satish","raju"};
        System.out.println(students[2]);




        //multidimensional array

        //2D array
        int flats[][]= new int[2][3];
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[1][0] = 103;
        flats[1][1] = 104;
        flats[1][2] = 105;

        for (int i =0; i<flats.length;i++){
            for (int j=0; j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }


        //problem1-Write a Java program to sort a numeric array and a string array.
        int arrays1[]= {34,67,78,9,34,4,8,56};
        String arrays2[]={
                "java",
                "c++",
                "python",
                "sparks",
                "kotlin"

        };
        System.out.println("Numeric Array before sorting :"+ Arrays.toString(arrays1));
        Arrays.sort(arrays1);
        System.out.println("Numeric Array After sorting :"+ Arrays.toString(arrays1));
        System.out.println("String Array before sorting :"+Arrays.toString(arrays2));
        Arrays.sort(arrays2);
        System.out.println("String Array After sorting :"+Arrays.toString(arrays2));


        //problem2-Write a Java program to sum values of an array
        int arrya3[]={10,20,40,50};
        int sum =0;
//        for (int i =0;i<arrya3.length;i++ ){
//            sum = sum + arrya3[i];
        for (int element:arrya3) {
            sum = sum + element;

        }
        System.out.println(sum);


        //problem3-Write a Java program to print the following grid.
        int array4[][]=new int[10][10];
        for (int i =0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.printf("-",array4[i][j]);
            }
            System.out.println();
        }



        //problem4-Write a Java program to calculate the average value of array elements.
        int array5[]={23,45,67,87,89};
        int total=0;
        for (int i=0;i<array5.length;i++){
            total=total+array5[i];
        }
         float average = total/array5.length;
        System.out.println(average);


        //problem-5Write a Java program to test if an array contains a specific value
        int array6[]={56,87,90,45,76,55};
        System.out.println(Contains(array6,760));

    }

    private static boolean Contains(int[] array6, int item) {
        for (int n : array6) {
            if (item == n)
                return true;
        }
        return false;
    }

 */
        //problem-6-Write a Java program to find the index of an array element.
        int array7[]={34,78,90,67,54};
        System.out.println();




    }

}
