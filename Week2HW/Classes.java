package Week2HW;

public class Classes {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        int n1 = 10;
        int n2 = 20;
        n2 = n1;
        n1=30;
        System.out.println(n2);

        int numbers1[] = new int[]{1,4,5};
        int numbers2[] = new int[]{2,7,9};
        numbers2 = numbers1;
        numbers1[0]=10;
        System.out.println(numbers2[0]);

    }
}
