package Week1HW;

public class recapDemo1 {
    public static void main(String[] args) {

        int sayi1 = 27;
        int sayi2 = 25;
        int sayi3 = 2   ;

        int enbuyuk = sayi1;

        if (enbuyuk<sayi2){
            enbuyuk = sayi2;
        }

        if (enbuyuk<sayi3){
            enbuyuk = sayi3;
        }

        System.out.println("En büyük sayı: "+ enbuyuk);

    }
}
