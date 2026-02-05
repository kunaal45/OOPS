package Oops;

interface a{
    void a();
}

interface b{
    void b();
}


public class Interface implements a,b {

    @Override
    public void a() {
        System.out.print("i am ");
    }

    @Override
    public void b() {
        System.out.print(" waiting ");
    }
    public static void main(String[] args) {
        Interface i = new Interface();

        i.a();
        i.b();
    }
}
