class vechical{
    vechical(){
        System.out.println("Vechical constructor is called ");
    }
}

class car extends vechical{
    car(){
        System.out.println("Car constructor is called");
    }
}
class vechicals{
    public static void main(String[] args) {
        car c1 = new car();
    }
}