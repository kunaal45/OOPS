package Oops;

public class Encapsulation {
    //Private Data Members
    private String name;
    private int age;

    public Encapsulation(String name,int age){
        this.name=name;
        this.age=age;
    }

    //Getter Methods
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //Setter Methods
    public void setName(String name){
        if(name!=null && !name.isEmpty())
        {
            this.name = name;
        }
        else {
            System.out.println("Invalid Name");
        }
    }
    public void setAge(int age){
        if(age>0 && age<100)
        {
            this.age = age;
        }
        else {
            System.out.println("Invalid Age");
        }
    }

    public void show() {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

}
