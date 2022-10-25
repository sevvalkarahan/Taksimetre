import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perkm = 2.20, total,starPrice=10;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz : ");
        km=klavye.nextInt();
        total=km*perkm;
        total += starPrice;
        total=(total<20)? 20:total;
        System.out.println("Ücretiniz "+total+" TL'dir");
    }
}
