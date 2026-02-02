package Classes_And_Objects;

public class Student {
    //Properties
    String name;
    int age;
    int rollNo;;

    //Constructors
    public Student(String name,int age,int rollNo)
    {
        this.name = name;// this  -> refers to the current object of the class
        this.age = age;
        this.rollNo = rollNo;
    }

    //Methods
    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Roll No : "+rollNo);
    }

}
