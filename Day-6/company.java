class person{
    String name;
    int age;

    void displayperson(){
        System.out.println("Name of the person: " +name);
        System.out.println("Age of the person" +age);
    }
}

class employee extends person{
    int employeeid;
    double salary;

    void displayemployee(){
        System.out.println("Employee id is " +employeeid);
        System.out.println("Salary is " +salary);
    }
}

class manager extends employee{
    String department;

    void displaymanager(){
        System.out.println("Department is" +department);
    }
}
class company{
    public static void main(String[] args) {
        manager s1 = new manager();
        s1.name = "Aditya";
        s1.age = 20;
        s1.employeeid = 250133;
        s1.salary = 56000;
        s1.department = "Technical";

        s1.displayperson();
        s1.displayemployee();
        s1.displaymanager();
        
    }
}