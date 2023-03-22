
interface PrentInterface1{
    void meth1();
    void meth2();
}
interface ChildInterface1 extends PrentInterface1{
    void meth3();
    void meth4();
}

class MySampleClass implements ChildInterface1{

    @Override
    public void meth1() {
        System.out.println("Meth1");
    }

    @Override
    public void meth2() {
        System.out.println("Meth2");
    }

    @Override
    public void meth3() {
        System.out.println("Meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }
}

public class practise_Interface_Ineritance {
    public static void main(String[] args) {
        MySampleClass msc = new  MySampleClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
    }
}
