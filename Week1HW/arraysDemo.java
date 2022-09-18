package Week1HW;

public class arraysDemo {
    public static void main(String[] args) {

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Mustafa";
        ogrenciler[1] = "Ayşe";
        ogrenciler[2] = "Yusuf";
        ogrenciler[3] = "Ali";

        for (int i=0; i< ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
