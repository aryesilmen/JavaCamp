package Week1HW;

public class MiniProjeAsalSayi {
    public static void main(String[] args) {
        int number = 2;
        boolean isPrime = true;

        if (number<=1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
        }
        System.out.println("Is the number a prime number: " + isPrime);
    }
}
