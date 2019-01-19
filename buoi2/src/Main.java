import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Nhap mot so tu ban phim: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Main y = new Main();
        y.tinh_gt(a);
        System.out.println("Giai thua la: " + y.tinh_gt(a));
    }

    public int tinh_gt(int a) {
        int giai_thua = 1;
        int i;
        for (i = 1; i <= a; i++) {
            giai_thua *= i;
        }
        return giai_thua;
    }
}
