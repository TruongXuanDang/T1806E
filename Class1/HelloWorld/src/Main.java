import java.util.Scanner;

public class Main {

    public int he_so;

    public static void main(String[] args) {
        Main y = new Main();
        y.setHe_so();
        System.out.println("He so cua doi tuong y la: " + y.he_so);
    }

    public void setHe_so() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        this.he_so = x;
    }
}
