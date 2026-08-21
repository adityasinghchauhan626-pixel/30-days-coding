class employee{
    void display(){
        System.out.println("Employee is working ");
    }
}

class developer extends employee{
    void display(){
        System.out.println("Developer is writing the code ");
    }
}

class manager extends employee{
    void display(){
        System.out.println("Manager is managing the team:");
    }
}
class company{
    public static void main(String[] args) {
        employee e1 = new manager();
        employee e2 = new developer();
        e1.display();
        e2.display();
        

    }
}