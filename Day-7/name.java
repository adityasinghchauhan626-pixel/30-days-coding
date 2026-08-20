class person{
    void introduce(String name){
        System.out.println("My name is " + name );
    }
}

class student extends person{
    @Override
    
    void introduce(String name){
        super.introduce("Aman");
        System.out.println("I am a student my name is " + name );
    }
}
class name{
    public static void main(String[] args) {
        student s1 = new student();
        s1.introduce("Aditya");

    }
}