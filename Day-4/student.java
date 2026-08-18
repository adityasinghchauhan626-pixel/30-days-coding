import java.util.Scanner;
class s{

    private String name;
    private int marks;

    public void setname(String name){
        this.name = name;
    }

    public void setmarks(int marks){
        this.marks= marks;

    }

    public String getname(){
        return name;
    }
    public int getmarks(){
        return marks;
    }
}
class student{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        s s1 = new s();
        System.out.println("Enter name :");

        String name = scn.nextLine();

        System.out.println("Enter the marks:");
        int marks = scn.nextInt();

        s1.setname(name);
        s1.setmarks(marks);

        if(s1.getmarks()>100 || s1.getmarks()<0){
            System.out.println("Invalid marks:");

        }

        else{
            System.out.println("Name :" + s1.getname());
            System.out.println("Marks :" + s1.getmarks());
        }
        scn.close();
    
    }
    

}

