public class Main2 {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.GiveCredit();
    }
}
