class animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class dog extends animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class cow extends animal{
    void sound(){
        System.out.println("Cows make sound of moos");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("Cat make a sound of meow ");
    }
}
class pet{
    public static void main(String[] args) {
        animal a1= new dog();
        a1.sound();
        animal a2 = new cow();
        a2.sound();
        animal a3 = new cat();
        a3.sound();
    }
}