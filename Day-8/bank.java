class bank_account{
    void account_type(){
        System.out.println("This is a bank account:");
    }
    void balance(double b){

        System.out.println("Available balance is " + b);
        
    }
}
class saving_account extends bank_account{
    @Override 
    void account_type(){
        System.out.println("This is a saving account ");
    }
    void add_intrest(){
        System.out.println("Intrest added to saving account ");
        
    }

}
class current_account extends bank_account{
    @Override
    void account_type(){
        System.out.println("This is a current account ");
    }
    void use_overdraft(){
        System.out.println("Overdraft faculty is used ");
    }
}
class bank{
    public static void main(String[] args) {
        bank_account s1 = new saving_account();
        s1.account_type();
        saving_account d1 = (saving_account) s1;
        d1.add_intrest();

        bank_account s2 = new current_account();
        s2.account_type();
        current_account c1 = (current_account) s2;
        c1.use_overdraft();

        bank_account z1 = new bank_account();
        z1.account_type();
        z1.balance(45999);
    }
}