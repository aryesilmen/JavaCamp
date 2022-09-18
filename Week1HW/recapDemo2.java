package Week1HW;

public class recapDemo2 {
    public static void main(String[] args) {

        double[] myList = {1.2, 7.7, 3.0, 5.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            System.out.println(number);
            total += number;
            if (max < number) {
                max = number;
            }
        }

        System.out.println("Toplam= " + total);
        System.out.println("En büyük değer = " + max);
    }
}
