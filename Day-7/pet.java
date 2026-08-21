class animal{
    void sound(){
        System.out.println("Animal makes sound ");
    }
}
class dog extends animal{

    @Override
    void sound(){
        System.out.println("Dog barks ");

    }
    void bark(){
        System.out.println("Dog is barking");
    }
}
class pet{
    public static void main(String[] args) {
        animal a1 = new dog();
        animal a2 = new animal();
        a1.sound();
        a2.sound();

    }
}