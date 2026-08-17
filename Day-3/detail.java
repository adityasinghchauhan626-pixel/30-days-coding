class student{
    String name;
    int rollno;
    int marks;

    student(String n , int r , int m ){
        name = n;
        rollno = r;
        marks = m;

    }
}

public class detail{

    public static void main(String[] args) {
        student s1 = new student("Aditya",20,89);
        student s2 = new student("Ashu",19,39);
        student s3 = new student("aryan",26,82);

        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.marks);


        System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println(s2.marks);


        System.out.println(s3.name);
        System.out.println(s3.rollno);
        System.out.println(s3.marks);


    }
}