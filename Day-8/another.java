import java.util.Scanner;
class employee{
    String name;
    int id;
    void work(){
        System.out.println("Employee is working");
    }
}

class developer extends employee{
    String language;
    @Override
    void work(){
        System.out.println("Developer is writing the code");
    }

    void display(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the name of deeloper ");
        name = scn.nextLine();
        System.out.println("Enter the id of employee ");
        id = scn.nextInt();
        scn.nextLine();

        System.out.println("Enter the language in which developer is working ");
        language = scn .nextLine();
        

        System.out.println("___________-Developer Details _______________");


        System.out.println("Name of the developer :" + name);
        System.out.println("Id of the developer :" + id);
        System.out.println("Language developer is working :" + language );
    }
}
class manager extends employee{
    String department;
    void work(){
        System.out.println("Manager is managing ");
    }
    void meeting(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the name of manager ");
        name = scn.nextLine();
        System.out.println("Enter the id of manager ");
        id = scn.nextInt();

        scn.nextLine();
        System.out.println("Enter the department in which manager is working ");
        department = scn .nextLine();
        

        System.out.println("___________Manager Details _______________");


        System.out.println("Name of the manager :" + name);
        System.out.println("Id of the manager  :" + id);
        System.out.println("Department of the manager :" + department );

    }
}
class another{
    public static void main(String[] args) {
        employee e1 = new developer();
        e1.work();

        developer d1 = (developer ) e1;
        d1.display();


        employee e2 = new manager();
        e2.work();
        manager m1 = (manager ) e2;
        m1.meeting();
    }
}