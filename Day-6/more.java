class vechile{
    String name = "Aditya";
}

class car extends vechile{
    String name = "Aryan";


    void display(){
        System.out.println("The name is " + name);

        System.out.println("The name is " + super.name);
    }
}

class more{
    public static void main(String[] args) {
        car c1 = new car();
        c1.display();
    }
}