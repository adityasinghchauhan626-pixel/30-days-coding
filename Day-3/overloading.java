class mobile{

    String name;
    int price;
    


    mobile(){
        name = "hii";

        System.out.println("Constructor 1");

    }

    mobile(String n){

        name = n;
        System.out.println("Constructor 2");
    }

    mobile(String n , int p){
        name = n;
        price = p;
        System.out.println("Constructor 2 ");
    }
}
class overloading{
    public static void main(String[] args) {
        mobile s1 = new mobile();
        mobile s2 = new mobile("Aditya");

        mobile s3 = new mobile("Aman",3000);

        System.out.println(s1.name);

        System.out.println(s2.name);

        System.out.println(s3.price);
        System.out.println(s3.name);
    }
}