abstract class vechile{
    abstract void start();

    void stop(){
        System.out.println("vechile is stopping");
    }

}
class car extends vechile{
    void start(){
        System.out.println("Car is start with button");
    }
}
class bike extends vechile{
    void start(){
        System.out.println("bike is getting start by kick or self ");
    }
}

class deep{
    public static void main(String[] args) {
        car c1 = new car();
        c1.start();
        bike b1 = new bike();
        b1.start();

    }
}