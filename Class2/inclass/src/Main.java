import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Main y = new Main();
        SoNguyen soNguyen = new SoNguyen();
//        soNguyen.tinh_gt();
//        System.out.println("Giai thua la: " + soNguyen.getKet_qua());
        soNguyen.tinh_gia_tri();
        System.out.println("Gia tri la: " + soNguyen.getKet_qua());
    }
}
