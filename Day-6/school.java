class person{
    String name;
    int age;
    void display_person(){
        System.out.println("Name is :"  + name);
        System.out.println("Age is " + age);

    }
}
class student extends person{
    int roll_no;

    void display_roll(){
        System.out.println("Roll no is " + roll_no);

    }
}

class teacher extends person{
    String subject;

    void display_subject(){
        System.out.println("Teaches subject " + subject);
    }
}

class school{
    public static void main(String[] args) {
        teacher t1 = new teacher();
        student s1 = new student();

        t1.name = "Manish";
        t1.age = 44;
        t1.subject = "DSA";
        s1.name = "Aditya";
        s1.age = 20;
        s1.roll_no = 15;

        s1.display_person();
        s1.display_roll();
        t1.display_person();
        t1.display_subject();
        
    }
}