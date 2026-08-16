public class Student{

    String name;
    int age;
    int fees;


    void display(){
        System.out.println(name);


    }
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Aditya";

        s1.age = 20;

        s1.fees = 1500000;

        System.out.println("My name is " + s1.name);

        System.out.println("Age is " + s1.age);

        System.out.println("college fees is " + s1.fees);

        s1.display();

    }


}
