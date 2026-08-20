class person {
    String name;
    int age;

    person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class student extends person {
    int roll_no;

    student(String name, int age, int roll_no) {

        super(name, age);

        this.roll_no = roll_no;
    }

    void display() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Roll-no is " + roll_no);
    }
}

class Main {
    public static void main(String[] args) {

        student s1 = new student("Aditya", 20, 101);

        s1.display();
    }
}