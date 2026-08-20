class vechile{
    void start(){
        System.out.println("Vechile is starting");
    }
}

class car extends vechile{
    @Override
    void start(){
        System.out.println("car start with button");
    }
}

class carss{
    public static void main(String[] args) {
        car c1 = new car();
        c1.start();
    }
}