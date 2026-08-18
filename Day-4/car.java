class detail {

    private String name;
    private int age;

    public void setname(String name) {
        this.name = name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }
}

public class car {

    public static void main(String[] args) {

        detail s1 = new detail();

        s1.setname("Aditya");
        s1.setage(19);

        System.out.println(s1.getname());
        System.out.println(s1.getage());
    }
}