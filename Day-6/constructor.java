class person{
    String name;
    person(String name){
        this.name = name;

    }
}
class employee extends person{

    int employeeid;

    employee(String name , int employeeid){
        super(name);
        this.employeeid = employeeid;
    }
}

class manager extends employee{
    String department;
    manager(String name , int employeeid , String department){
        super(name , employeeid);
        this.department = department;
    }

    void display(){
        System.out.println("Name is " + name);
        System.out.println("ID is " + employeeid);
        System.out.println("department is " + department);
    }
}

class constructor {
    public static void main(String[] args) {
        manager s1 = new manager("Aditya ",450,"technical");
        s1.display();
        
    }
}