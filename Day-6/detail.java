class person{
    String name;
    int age;


    void display(){
        System.out.println("Name is " + name);
        System.out.println("Age is :" + age);
    }
}

class child extends person{

    int roll_no;
    void display_student(){
        System.out.println("Roll no is "+roll_no);
    }
}
class detail{
    public static void main(String[] args) {
        child s1= new child();

        s1.name ="Aditya";
        s1.age = 20;
        s1.roll_no = 20;

        s1.display();
        s1.display_student();
    }
}