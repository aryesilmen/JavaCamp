package Week1HW;

public class sayiBulma {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int wanted = 44;
        int index = 0;
        boolean isThere = false;

        for (int i = 0; i < numbers.length; i++) {
            if (wanted == numbers[i]) {
                index = i;
                isThere = true;
                break;
            }
        }

        if (isThere) {
            System.out.println(wanted + " sayısı dizinin " + index + ". indexindedir.");
        } else {
            System.out.println(wanted + " sayısı dizide bulunmuyor.");
        }
    }
}
