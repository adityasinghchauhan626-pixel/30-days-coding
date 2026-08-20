class bank{
    void pay(){
        System.out.println("Bank is making the payment");
    }
}

class credit_card extends bank{
    void pay(){
        super.pay();
        System.out.println("credit card is processing payment");
    }
}
class payment{
    public static void main(String[] args) {
        credit_card d1 = new credit_card();
        d1.pay();

    }
}