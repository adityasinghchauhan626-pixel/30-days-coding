class car{

    String Brand;
    int price;
    String model;

    car(String B , int p ,String m){

        Brand = B;
        price = p;
        model = m;
    }
}

class para{
    public static void main(String[] args) {

        car s1 = new car("Baleno",670000,"Base");

        System.out.println(s1.Brand);
        System.out.println(s1.price);
        System.out.println(s1.model);
        
    }
}
    
