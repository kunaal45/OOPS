import Classes_And_Objects.Student;
import Oops.Encapsulation;

public class Main {
  public static void main(String[] args) {
    //Object creating
    Student s1 = new Student("Sujay",20,360);//new -> dynamically allocates memory
    Student s2 = new Student("Abishek",21,105);
    s1.display();
    s2.display();

    //Encapsulation
    Encapsulation en =  new Encapsulation("Yogesh",22);
    en.show();
    en.setName("Yogeswaran");
    System.out.println(en.getName());
    en.setAge(21);
    System.out.println(en.getAge());
  }
}