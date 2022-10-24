public class CustomerManager {

    private Customer customer;
    private ICreditManager creditManager;
    public CustomerManager (Customer customer, ICreditManager creditManager){
        this.customer = customer;
        this.creditManager = creditManager;
    }
    public void Save(){
        System.out.println("Customer has saved.");
    }
    public void Delete(){
        System.out.println("Customer has deleted.");
    }

    public void GiveCredit(){

        creditManager.Calculate();
        System.out.println("Credit has given.");

    }
}
