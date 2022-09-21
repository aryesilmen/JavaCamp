package Week1HW;

public class ArkadasSayilar {
    public static void main(String[] args) {
        int n1 = 220;
        int n2 = 284;

        boolean isFriend = false;

        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0) {
                total1 += i;
            }
        }

        for (int i = 1; i < n2; i++) {
            if (n2 % i == 0) {
                total2 += i;
            }
        }

        if (total1 == n2 && total2==n1 ) {
            isFriend = true;
        }
        System.out.println("Are numbers friend numbers: " + isFriend);
    }
}
