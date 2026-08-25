public class Electricity {
    int consumerid;
    String consumerName;
    int units;
    Electricity(int id,String name,int unit){
        consumerid =id;
        consumerName =name;
        units =unit;


    }

    void calculateBill(){

        double Bill;

        if(units<=100)
            Bill = units*3;
        else if (units<=300)
            Bill = (100*3)+((units-100)*5);

        else 
            Bill=(100*3) + (200*5)*((units-300)*8);
        if(Bill>3000)
            Bill = Bill+(Bill*0.05);

        System.out.println("Id"+consumerid);

        System.out.println("name"+consumerName);
        System.out.println("units"+units);

        System.out.println("bill"+Bill);



    }

    public static void main(String[] args) {
        Electricity e = new
        Electricity(101,"Aditya chouhan",450);
        e.calculateBill();
        
    }
    
}
