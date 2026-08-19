import java.util.Scanner;

class d{

    private String name;
    private double salary;

    public void setname(String name){
        this.name= name;
    }

    public void setsalary(double salary){
        if(salary<0){
            System.out.println("salary cannot be negative");
            this.salary =0;
        }
        else{
            this.salary=salary;
        }
    }

    public String getname(){
        return name;
    }

    public double getsalary(){
        return salary;
    }
}

class as{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        d s1 = new d();
        d s2 = new d();
        System.out.println("Enter the name of employee 1");
        String name1 = scn.nextLine();
        System.out.println("Enter the salary of employee 1 ");
        double salary1 =scn.nextInt();
        
        scn.nextLine();
        System.out.println("Enter the name of employee 2");
        String name2 = scn.nextLine();
        System.out.println("Enter the salary of employee 2");
        double salary2 = scn.nextInt();


        s1.setname(name1);
        s1.setsalary(salary1);
        s2.setname(name2);
        s2.setsalary(salary2);
        scn.close();
        

            System.out.println("Invalid");

            System.out.println("name is " + s1.getname());
            System.out.println("salary is :" + s1.getsalary());
        

        System.out.println("Detail of employee 2");
        System.out.println(s2.getname());
        System.out.println(s2.getsalary());


        
    }
    
}