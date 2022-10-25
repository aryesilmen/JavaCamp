public class CustomerManager {

    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void add(){
        System.out.println("Customer has added.");
        this.logger.log("Log message");
    }

}
