import java.util.Scanner;

public class integer {
    int n;

    public int inputValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri n");
        n = scanner.nextInt();
        return n;
    }

    public int[] primeValue(int n) {
        int[] primeArray = new int[100];
        int no = 0;
        int soGiaTriChiaHet=0;
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                for (int t = 1; t <= Math.sqrt(i); t++) {
                    if ((i % t) == 0) {
                        soGiaTriChiaHet++;
                    }
                }
                if(soGiaTriChiaHet==1){
                    primeArray[no]=i;
                    no++;
                }
                soGiaTriChiaHet=0;
            }

        } else {
            System.out.println("Khong co so nguyen to nao.");
        }
        return primeArray;
    }

    //Day so Fibonacci bat dau tu 1
    public int[] fibonacciArray(int n) {
        int[] fibonacciArray = new int[n];
        int sum = 2;
        if (n == 0) {
            sum = 1;
        } else if (n == 1) {
            sum = 2;
        } else if (n >= 2) {
            for (int i = 2; i < n; i++) {
                fibonacciArray[0] = 1;
                fibonacciArray[1] = 1;
                fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
                sum += fibonacciArray[i];
            }
        } else {
            System.out.println("Khong ton tai day so Fibonacci.");
        }
        return fibonacciArray;
    }
}

