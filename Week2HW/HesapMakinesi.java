package Week2HW;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int result = 0;
        System.out.println("Toplama (+)\nÇıkarma (-)");
        Scanner scanner = new Scanner(System.in);
        result = scanner.nextInt();
        String operator = scanner.next();
        switch (operator) {
            case "+":
                sum(result);
                int topla = sum(scanner.nextInt());
                System.out.println(result);
            case "-":
                int cikar = extract(result, scanner.nextInt());
                System.out.println(result);
            default:
                System.out.println("Hatalı tuşlama yaptınız!");
        }

    }

    public static int sum(int number) {
        int result = 0;
        result += number;
        return result;
    }

    public static int extract(int result, int number) {
        result -= number;
        return result;
    }

    public static int clear() {
        int result = 0;
        return result;
    }
}
