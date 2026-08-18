class detail{

    String name;
    int age;
    int rollno;

    detail(){

        System.out.println("constructor 1");
        this("Aditya",20);


    }

    detail(String name , int age ){

        this.name = name;
        this.age = age;

        System.out.println("constructor 2 ");

        this("Aryan ",21,15);

    }

    detail(String name , int age , int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;

        System.out.println("constructor 3");


    }
}

class student{
    public static void main(String[] args) {
        detail s1 = new detail();

        System.out.println(s1.name);
    }
}