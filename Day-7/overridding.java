class employee{
    void display(){
        System.out.println("employee is working ");
    }
}

class developer extends employee{
    @Override
    void display(){
        super.display();
        System.out.println("Developer is writing code");
    }
}
class overridding{
    public static void main(String[] args) {
        developer d1 = new developer();
        d1.display();
    }
}