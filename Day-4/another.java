import java.util.Scanner;

class d{
    private String name;
    private int salary;

    public void setname(String name){
        this.name = name;
    }

    public void setsalary(int salary){
        this.salary = salary;
    }

    public String getname(){
        return name;
    }

    public int getsalary(){
        return salary;
    }
}
class another{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        d s1 = new d();
        d s2 = new d();

        System.out.println("Enter the name :");
        String name1 = scn.nextLine();
        System.out.println("Enter salary :");
        int salary1 = scn.nextInt();
            scn.nextLine();

        System.out.println("Enter the name 2 :");
        String name2 = scn.nextLine();
        System.out.println("Enter salary 2:");
        int salary2 = scn.nextInt();


        

        s1.setname(name1);
        s1.setsalary(salary1);
        s2.setname(name2);
        s2.setsalary(salary2);

        if(s1.getsalary()<0){
            System.out.println("invalid");
        }
        else{
            System.out.println(s1.getname());
            System.out.println(s1.getsalary());
        }

        System.out.println("second employee");
        System.out.println(s2.getname());
        System.out.println(s2.getsalary());
        scn.close();
        
            
        
    }
}
