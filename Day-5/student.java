import java.util.Scanner;
class detail{
    private String name;
    private int age;
    private int marks;

    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        if(age<0||age>100){
            System.out.println("Invalid age:");
            this.age=0;
        }

        else{
            this.age=age;
        }

        
    }
    public void setmarks(int marks){
        if(marks<0||marks>100){
            System.out.println("Invalid marks:");

        }
        else{
            this.marks=marks;
        }
    }

    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public int getmarks(){
        return marks;
    }
}
class student{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        detail s1 = new detail();
        detail s2 = new detail();

        System.out.println("Enter the name of Student 1");
        String name1=scn.nextLine();
        System.out.println("Enter the age of student 1:");
        int age1 =scn.nextInt();
        System.out.println("Enter the marks of student 1");
        int marks1=scn.nextInt();

        scn.nextLine();
        System.out.println("Enter the name of Student 2");
        String name2=scn.nextLine();
        System.out.println("Enter the age of student 2:");
        int age2 =scn.nextInt();
        System.out.println("Enter the marks of student 2");
        int marks2=scn.nextInt();

        s1.setname(name1);
        s1.setage(age1);
        s1.setmarks(marks1);

        s2.setname(name2);
        s2.setage(age2);
        s2.setmarks(marks2);
        scn.close();

        System.out.println(s1.getname());
        System.out.println(s1.getage());
        System.out.println(s1.getmarks());

        System.out.println(s2.getname());
        System.out.println(s2.getage());
        System.out.println(s2.getmarks());
    }
}