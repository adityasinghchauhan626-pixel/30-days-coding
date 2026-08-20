class employee{
    void display(){
        System.out.println("Employee is working ");
    }
}

class developer extends employee{
    @Override
    void display(){
        System.out.println("Developer is writing code");
    }
}
class manager extends employee{
    @Override
    void display(){
        System.out.println("manager is managing the team ");
    }

}
class company{
    public static void main(String[] args) {
        manager m1 = new manager();
        developer d1 = new developer();
        m1.display();
        d1.display();
        

    }
}