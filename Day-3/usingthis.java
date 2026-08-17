class employee{
    String name;
    int salary;

    employee(String name , int salary){
        this.name = name;
        this.salary = salary;

    }
}
class usingthis{
    public static void main(String[] args) {
        employee s1 = new employee("Aditya", 30000);

        System.out.println(s1.name);
        System.out.println(s1.salary);
    }
}