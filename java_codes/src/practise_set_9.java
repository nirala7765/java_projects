

 class Sphere1{
    private int S_radius;

     public void setS_radius(int R){
         this.S_radius=R;

     }
     public int getS_radius(){
         return S_radius;
     }
     public double SurfaceAreaOfSphere(){
         return 4*3.14*S_radius*S_radius;
     }
     public double VolumeOfSphere(){
         return 1.333333*3.14*S_radius*S_radius*S_radius;
     }
 }


class Rectangle1{
    int Length ;
  int Breadth ;

    public Rectangle1(int l,int b){
        Length = l;
        Breadth = b;

    }
    public Rectangle1(int L){
        Length=L;

    }

}

class Cylinder{
    private double radius;
    private double height;

    public void setRadius(double R){
        this.radius=R;
    }
    public double getRadius(){
        return radius;
    }
    public void setHeight(Double H){
        this.height=H;
    }
    public double getHeight(){
        return height;
    }
    public double AreaOfSurfaceOfCylinder(){
        return (2*3.14*radius*height)+(2*3.14*radius*radius);
    }
    public double VolumeOfCylinder(){
        return 3.14*radius*radius*height;
    }
   public Cylinder(double R,double H){
        radius = R;
        height= H;
   }

}
public class practise_set_9 {
    public static void main(String[] args) {
        //problem1 create a class Cylinder and use Setters and getters to Set its radus and height.

//           Cylinder c1 = new Cylinder();
//        c1.setHeight(55.6);
//        c1.setRadius(25.6);
//        System.out.println("Height of Cylinder is : "+c1.getHeight()+" m");
//        System.out.println("Radius of Cylinder is : "+c1.getRadius()+" m");

        //problem2 Use O to calculate surface area and Volume of the cylinder
//        System.out.println("Total Surface Area Of Cylinder is : "+c1.AreaOfSurfaceOfCylinder()+" m^2");
//        System.out.println("Volume of Cylinder is : "+c1.VolumeOfCylinder()+" m^3");

        // problem 3 solve 1 using constructor

//        Cylinder c1 = new Cylinder(36.6,55.6);
//        System.out.println("Height of Cylinder is : "+c1.getHeight()+" m");
//        System.out.println("Radius of Cylinder is : "+c1.getRadius()+" m");
//        System.out.println("Total Surface Area Of Cylinder is : "+c1.AreaOfSurfaceOfCylinder()+" m^2");
//       System.out.println("Volume of Cylinder is : "+c1.VolumeOfCylinder()+" m^3");

        //problem4 - Overland a Constructer used to. initialize a rectangk  of knath 4 and breadth 5.for using custom parameters
//        Rectangle1 R1 = new Rectangle1(4,5);
//        System.out.println("Length of R1 is : "+R1.Length+"m");
//        System.out.println("Breadth of R1 is : "+R1.Breadth+"m");
//        Rectangle1 R2 = new Rectangle1(9);
//        System.out.println("Length of R2 is: "+R2.Length+"m");

        //problem5- create a class Sphere and use Setters and getters to Set its radus and height.

             Sphere1 s1 = new Sphere1();
             s1.setS_radius(5);
        System.out.println("The Radius of Sphere is : "+s1.getS_radius()+"m");
        System.out.println("The sphere Area Of Sphere is : "+s1.SurfaceAreaOfSphere()+" M^2");
        System.out.println("The Volume of Sphere is : "+s1.VolumeOfSphere()+" M^3");




    }
}
