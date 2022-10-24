public class Main {
    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();

        System.out.println();

        Customer customer = new Customer();
        customer.id=1;

        CustomerManager customerManager = new CustomerManager(customer, (ICreditManager) creditManager);

        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.TaxNumber="111111";
        company.CompanyName = "Arcelik";
        company.id= 100;

        CustomerManager customerManager2 = new CustomerManager((Customer) company, (ICreditManager) creditManager);

        Person person = new Person();
        person.FirstName = "Enes";

    }
}
