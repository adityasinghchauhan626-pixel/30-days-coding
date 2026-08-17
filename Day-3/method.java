class person{

    String name;
    int age;

    person(String n , int a ){


        name = n;
        age = a;



    }

    void display(){

        System.out.println(name);

        System.out.println(age);
    }


}

class method{

    public static void main(String[] args) {
         
        person s1 = new person("Aditya",20);

        s1.display();
    }
}