public class car {

    String name;
    String model;
    int price;
    void display(){

        System.out.println(name);
        System.out.println(model);
        System.out.println(price);
    }


    public static void main(String[] args) {
        car s1 = new car();

        s1.name  = "baleno";
        s1.model = "base";
        s1.price = 650000;
        
        s1.display();
    }
    
}
