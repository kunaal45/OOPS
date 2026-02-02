import Classes_And_Objects.Student;

public class Main {
  public static void main(String[] args) {
    //Object creating
    Student s1 = new Student("Sujay",20,360);//new -> dynamically allocates memory
    Student s2 = new Student("Abishek",21,105);
    s1.display();
    s2.display();
  }
}