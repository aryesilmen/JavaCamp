package Week2HW;

public class Methods2 {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi= topla(5,7);
        System.out.println(sayi);
        int sayi2= topla2(3,4,5,6,7,3,3,22,1,1);
        System.out.println(sayi2);

    }
    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void güncelle(){
        System.out.println("Güncellendi");
    }

    public static int topla(int n1, int n2){
        return n1+n2;
    }

    public static int topla2(int... numbers){
        int toplam=0;
        for (int number:numbers){
            toplam+=number;
        }
        return toplam;
    }

    public static String sehirVer(){
        return "Ankara";
    }
}
