class employee{
    String name;
    int id;
    employee(String name , int id){
        this.name = name ;
        this.id = id;
    }

    void work(){
        System.out.println("Employee is working");
    }
    final void company_rules(){
        System.out.println("Follow the rules");
    }
}

class developer extends employee{
    String programming;
    developer(String name , int id , String programming){
        super(name,id);
        this.programming = programming;
    }

    @Override
    void work(){
        System.out.println("Developer is writing code:");
        System.out.println("Name of developer :" + name);
        System.out.println("ID of developer : " + id);
        System.out.println("Progamming language : " + programming);
    }

    static void role(){
        System.out.println("Developer");
    }
}

class manager extends employee{
    String department;
    manager(String name , int id, String department){
        super(name , id);
        this.department = department;
    }
    @Override
    void work(){
        System.out.println("Manager is managing the team");
        System.out.println("Name of manager: " + name);
        System.out.println("ID of manager: " + id);
        System.out.println("Department : " + department);

    }

    static void role(){
        System.out.println("Manager");
    }
}

class job{
    public static void main(String[] args) {
        manager m1 = new manager("Atul",450,"Sales");
        developer d1 = new developer("Aditya",5439,"Java");
        System.out.println("_______Developer______");
        d1.work();
        developer.role();
        System.out.println("_____Manager____");
        m1.work();
        manager.role();


    }
}