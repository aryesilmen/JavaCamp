package Week1HW;

public class SesliHarfler {
    public static void main(String[] args) {

        char karakter = 'a';
        String harf = Character.toString(karakter);
        harf = harf.toUpperCase();

        switch (harf) {
            case "A":
            case "I":
            case "O":
            case "U":
                System.out.println(karakter + " kalın seslidir.");
                break;
            case "E":
            case "İ":
            case "Ö":
            case "Ü":
                System.out.println(karakter + " ince seslidir.");
                break;
            default:
                System.out.println(karakter + " sessiz harftir.");
        }
    }
}
