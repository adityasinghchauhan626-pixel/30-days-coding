class parent{
    final void show(){
        System.out.println("This method cannot be overridden");
    }
}
class child extends parent{
    void display(){
        System.out.println("This is a child method");
    }
}

class finakkey{
    public static void main(String[] args) {
         child c1 = new child();
         c1.show();
         c1.display();
    }
}