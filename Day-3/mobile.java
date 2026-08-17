class detail{

    String name;
    int price;

    detail(String n , int p){

        name = n;

        price = p;


        
    }


}

class mobile{

    public static void main(String[] args) {
        detail s1 = new detail("Aditya",25000);

        detail s2 = new detail("Vivo", 30000);


        System.out.println(s1.name);
        System.out.println(s1.price);

        System.out.println(s2.name);
        System.out.println(s2.price);
    }
}