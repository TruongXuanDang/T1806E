import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Main y = new Main();
        y.Phep_tinh(a,b);
        System.out.println("Gia tri cua phep tinh la: " + y.Phep_tinh(a,b));
    }

    public int Phep_tinh(int a, int b){
        System.out.println("Hay chon cac phep tinh sau:");
        System.out.println("1. Phep cong");
        System.out.println("2. Phep tru");
        System.out.println("3. Phep nhan");
        System.out.println("4. Phep chia");
        Scanner scanner = new Scanner(System.in);
        int pheptinh = scanner.nextInt();
        int Giatri=0;
        switch (pheptinh)
        {
            case 1:
                Giatri= a+b;
                break;
            case 2:
                Giatri= a-b;
                break;
            case 3:
                Giatri= a*b;
                break;
            case 4:
                Giatri= a/b;
                break;
        }
        return Giatri;
    }
}
