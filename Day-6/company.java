class employee{
    String name;
    int employeeid;
    int salary;

    void displayemployee(){
        System.out.println("Name of employee is "+name);
        System.out.println("Employee id is "+employeeid);
        System.out.println("Salary of employee is "+salary);
    }
}

class manager extends employee{
    String department;

    void displaymanager(){

        System.out.println("Department "+department);

    }
}
class company{
    public static void main(String[] args) {
        manager s1 = new manager();

        s1.name = "Aditya";
        s1.employeeid= 250133;
        s1.salary = 56000;
        s1.department = "Technical";

        s1.displayemployee();
        s1.displaymanager();
    }
}