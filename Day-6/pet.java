class animal{
    void display(){
        System.out.println("THis is a animal class");
    }
}

class dog extends animal{
    void display(){
        System.out.println("Dog barks ");

        super.display();
    }
}

class pet{
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.display();
    }
}