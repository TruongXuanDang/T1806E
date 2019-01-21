import java.util.Scanner;

public class SoNguyen {

    int ket_qua;

    public void tinh_gt() {
        System.out.println("Nhap mot so tu ban phim: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int giai_thua = 1;
        int i;
        for (i = 1; i <= a; i++) {
            giai_thua *= i;
        }
        ket_qua = giai_thua;
    }



    public void tinh_gia_tri() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri a");
        int a = scanner.nextInt();
        System.out.println("Nhap gia tri b");
        int b = scanner.nextInt();
        System.out.println("Nhap phep toan: ");
        System.out.println("1.Phep cong ");
        System.out.println("2.Phep tru ");
        System.out.println("3.Phep nhan ");
        System.out.println("4.Phep chia ");

        int phep_toan = 0;
        phep_toan=scanner.nextInt();
        int gia_tri = 0;

        switch (phep_toan) {
            case 1:
                gia_tri = a + b;
                break;
            case 2:
                gia_tri = a - b;
                break;
            case 3:
                gia_tri = a * b;
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Khong chia dc cho 0");
                } else {
                    gia_tri = a / b;
                    break;
                }
        }
        ket_qua=gia_tri;
    }

    public int getKet_qua() {
        return ket_qua;
    }
}
