package Week1HW;

public class MukemmelSayi {
    public static void main(String[] args) {

        int number = 28;

        boolean isPerfect = false;

        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            isPerfect = true;
        }
        System.out.println("Is the number a perfect number: " + isPerfect);
    }
}
