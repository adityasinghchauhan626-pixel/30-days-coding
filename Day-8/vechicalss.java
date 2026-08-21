class vechile{
    void start(){
        System.out.println("Vechile is getting start");
    }
}
class car extends vechile{
    @Override
    void start(){
        System.out.println("Press button to start");
    }
    void opendoor(){
        System.out.println("Door is getting opened ");
    }
}
class vechicalss{
    public static void main(String[] args) {
        car c1 = new car();
        c1.start();
        c1.opendoor();

        vechile v1 = new vechile();
        v1.start();
    }
}