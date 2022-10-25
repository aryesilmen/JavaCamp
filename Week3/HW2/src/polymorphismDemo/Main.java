package polymorphismDemo;

public class Main {
    public static void main(String[] args) {

        /*polymorphismDemo.BaseLogger[] loggers = new polymorphismDemo.BaseLogger[]{new polymorphismDemo.FileLogger(), new polymorphismDemo.DatabaseLogger(),new polymorphismDemo.ConsoleLogger(), new polymorphismDemo.EmailLogger()};
        for (polymorphismDemo.BaseLogger logger: loggers){
            logger.Log("Log message");
        }*/
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}