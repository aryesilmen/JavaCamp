package Week2HW;

public class Methods {
    public static void main(String[] args) {
        sayiBulmaca(5);
    }

    public static void sayiBulmaca(int wanted) {
        int[] numbers = {1, 2, 4, 6, 7, 3, 9, 0};
        boolean isThere = false;

        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (wanted == numbers[i]) {
                isThere = true;
                index = i;
            }
        }

        if (isThere) {
            message(wanted + " sayısı dizinin " + index + ". indeksindedir");
        } else message(wanted + " sayısı dizide bulunmuyor.");
    }


    public static void message(String message) {
        System.out.println(message);
    }
}
