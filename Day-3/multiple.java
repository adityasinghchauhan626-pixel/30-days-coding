class car{

    String name;
    int price;
    String colour;

    car(){

        this("Breeza",100000);
        System.out.println("Constructor 1");
    }

    car(String name , int price){

        this("Glanza",70000,"White");

        this.name = name;
        this.price = price;
        System.out.println("constructor 2");

    }

    car(String name , int price , String colour){

        this.name = name;
        this.price = price;
        this.colour = colour;

        System.out.println("constructor 3");

    }
}

class multiple{

    public static void main(String[] args) {
        car s1 = new car();
        System.out.println(s1.name);
    }
}