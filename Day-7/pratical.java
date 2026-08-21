class person{
    protected void display(){
        System.out.println("this is a person");
    }
}
class student extends person{
    @Override
    public void display(){
        super.display();
        System.out.println("This is a student");
    }
}

class pratical{
    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
    }
}