import java.util.Arrays;

public class practise_set_6 {
    public static void main(String[] args) {
        /*
        // problem:1
        float num [] = {23.0f,45.6f,66f,99.9f,65.9f};
        float sum =0;
//        for (int i =0;i< num.length;i++){
//            sum = sum + num[i];
//        }
        for (float element :num) {
            sum = sum + element
        }


        System.out.println(sum);


        //problem2
        int [] numbers = {33,45,76,98};
        int num1 = 176;
        boolean isInArray = false;
        for (int element:numbers) {
            if (num1 == element) {
                isInArray = true;
                break;
            }
        }
            if (isInArray){
                System.out.println("The value is present in array");
            }else
                System.out.println("the value is not present in array ");


        //problem3
        int marks[] = {76,89,98,90,78};
        int total = 0;
        float average;
        for (int i = 0; i< marks.length;i++){
            total = total + marks[i];
        }

         average = total/ marks.length;
        System.out.println("The average marks of phy is "+average);


        //problem4
        int mat1[][] = {{1,5,7,},
                        {4,5,8}};
        int mat2[][] = {{9,7,4},
                        {3,8,0} };
        int result[][]={{0,0,0},
                        {0,0,0}};
        for (int i=0;i<mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
               // System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }



        //problem5
        int array[] = {23,67,87,90,56};
        int l = array.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for (int i =0;i<n;i++){
            temp = array[i];
            array[i]= array[l-i-1];
            array[l-i-1]=temp;
        }
        for (int element:array) {
            System.out.print(element+" ");

        }
//        for (int i=array.length-1;i>=0;i--)
//            System.out.println(array[i]);



        //problem6
       int array1[] = {45,98,99,70,56,88,245,99889};
        // System.out.println(Arrays.stream(array1).max());
        //int max=0;
        int max = Integer.MIN_VALUE;
        for (int e: array1){
            if (e>max)
                max= e;
        }

        System.out.println("the maximum value in this array is:"+max);





        //problem 7
        int array2[]={56,98,90,45,32,21};
        //System.out.println(Arrays.stream(array2).min());
         int min = Integer.MAX_VALUE;
         for (int e:array2){
             if (e<min)
                 min=e;
         }
        System.out.println(min);

         */
        //problem8
        int array3[]={2,3,4,5};
        boolean isSorted = true;
        for (int i =0; i<array3.length-1;i++){
            if (array3[i]>array3[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The arrays "+ Arrays.toString(array3) +" is Sorted ");
        }else {
            System.out.println("The arrays "+ Arrays.toString(array3) +" is not Sorted ");
        }

    }
}
