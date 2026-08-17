class student{

    String name;
    int age;
    int rollno;


    student(){

        System.out.println("Constructor 1");
    }

    student(String n){

        name = n;

        System.out.println("construcotr 2");
    }

    student(String n ,int a){
        name = n;
        age = a;

        System.out.println("Constructor 3");
    }

    student(String n , int a ,int r){
        name = n;
        age = a;
        rollno = r;

        System.out.println("constructor 4");
    }
}
class pratice {

    public static void main(String[] args) {
       // student s1 = new student();
        student s2 = new student("Aditya");
        student s3 = new student("aman" , 20);
        student s4 = new student("Arun",30,19);

        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s4.rollno);

    }
}