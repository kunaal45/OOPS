package Oops;

class Calculator {//Method Overloading -> Same method name ,Different Parameters
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b,double c) {
        return a + b + c;
    }
    void show() {
        System.out.println("This is a Polymorphism");
    }
}
 public class Polymorphism extends Calculator {

    @Override
    void show() {
        System.out.println("This is a Overriden Polymorphism");
    }

    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();

        //method Overloading ->
        System.out.println(p.add(5,7));
        System.out.println(p.add(5,7,9));

        //Mehtod Overridden ->
        Calculator c = new Polymorphism();
        c.show();
    }
 }
