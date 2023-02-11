public class methods {

    static  void change2(int arr[]){
    arr[0] = 98;
    }
     static  void telljoes(){
         System.out.println("Happy birthday to you! Make everyone laugh with " +
                 "these funny birthday jokes that will make you the life of the part");
     }
    static  int sum(int x , int y){
        int z;
        if (x>y){
            z=x+y;
        }else {
            z= (x+y)*5;
        }
        return z;
    }
    static void change(int x){
        int a = 98;
    }

    static int product(int P,int Q){
        int R = P*Q;
        return R;
    }
    static  String Name(String m,String n){
        String l = m+n;
        return l;
    }
    int diff(int e,int f){
        int g = e-f;
        return g;
    }
    public static void main(String[] args) {
        telljoes();
        int marks[]={76,89,78,65};
        change2(marks);
        System.out.println(marks[0]);




        int x = 45;
        change(x);
        System.out.println("the value after change "+x);

        int a=5;
        int b=6;
        int c ;
        c = sum(a,b);
        System.out.println(c);
        int a1 =2;
        int b1= 1;
        int c1;
        c1=sum(a1,b1);
        System.out.println(c1);

        int a2 = 6;
        int b2 = 9;
        int c2 ;
        c2=product(a2,b2);
        System.out.println(c2);

        String a3 = "Ram is a ";
        String b3 = "good Boy";
        String c3 ;
        c3=Name(a3,b3);
        System.out.println(c3);


        methods obj = new methods();
        int a4=9;
        int b4 =6;
        int c4;
        c4 = obj.diff(a4,b4);
        System.out.println(c4);

    }
}
