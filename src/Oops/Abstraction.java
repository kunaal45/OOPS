package Oops;

abstract class Colour {
    abstract void flavours(String a, String b);
}

public class Abstraction extends Colour {

    @Override
    public void flavours(String a, String b) {
        System.out.println(a +" loves "+ b);
    }
    public static void main(String[] args) {
        Abstraction a = new Abstraction();

        a.flavours("red", "blue");
    }
}
