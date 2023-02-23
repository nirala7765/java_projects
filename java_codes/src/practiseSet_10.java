

class Circle1{
    int radius;

    public Circle1(int r) {
        this.radius=r;
    }

    public double areaofcircle(){
        return 3.14*radius*radius;

    }

}

class Cylinder1 extends Circle1{
    int height;

    public Cylinder1(int r ,int h) {
        super(r);
        this.height = h;
    }



    public double Areaofcylinder(){
        return 2*3.14*radius*height+23.14*radius*radius;
    }

    public double VolumeOfcylinder(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}

class Rectangle2{
    public int length;
    public int width;

    public Rectangle2(int l,int w){
        this.length=l;
        this.width=w;

    }

    public int AreaOfRectangle(){
        return this.length*this.width;
    }

    public int PerimeterOfRectangle(){
       return  2*(this.length*this.width);
    }

}

class Cuboid1 extends Rectangle2{
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public Cuboid1(int l, int w, int h){
        super(l,w);
        this.height=h;

    }

    public double surfaceAreaOfCuboid(){
        return 2*(this.length*this.width)+2*(this.length*this.height)+2*(this.height*this.width);
    }

    public double VolumeOfCuboid(){
        return this.length*this.width*this.height;
    }
}


class gradParent{

    public gradParent(){
        System.out.println("I am a grand father of 3 grand children ");
    }
}


class Parent extends gradParent{

    public Parent(){
        System.out.println(" I am Single child Parent");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println(" I am only child of my Parent ");
    }
}






public class practiseSet_10 {
    public static void main(String[] args) {
        //problem1
//        Cylinder1 c1 = new Cylinder1(12,8);
//        System.out.println(c1.Areaofcylinder());
//        System.out.println(c1.VolumeOfcylinder());

        //problem2

//        Cuboid1 cuboid1 = new Cuboid1(5,8,9);
//        cuboid1.setHeight(55);
//        System.out.println("Area of Rectangle is : "+cuboid1.AreaOfRectangle());
//        System.out.println("Perimeter of Rectangle is : "+cuboid1.PerimeterOfRectangle());
//        System.out.println("Volume of Cuboid is : "+cuboid1.VolumeOfCuboid());
//        System.out.println("Surface Area of Cuboid is : "+cuboid1.surfaceAreaOfCuboid());
//        System.out.println(cuboid1.getHeight());

        //problem5

        Child ch1 = new Child();
       



    }
}
