package Week1HW;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        sehirler[0][0]= "İstanbul";
        sehirler[0][1]= "Balıkesir";
        sehirler[0][2]= "Bursa";
        sehirler[1][0]= "Trabzon";
        sehirler[1][1]= "Rize";
        sehirler[1][2]= "Samsun";
        sehirler[2][0]= "Mardin";
        sehirler[2][1]= "Diyarbakır";
        sehirler[2][2]= "Batman";

        for (int i = 0; i< sehirler.length;i++){
            System.out.println("------------------");
            for (int j=0;j< sehirler.length; j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
