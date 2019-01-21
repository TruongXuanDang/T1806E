public class Main {

    public static void main(String[] args) {
        Main y = new Main();
        integer integer = new integer();
        int n=integer.inputValue();

        System.out.println("Cac so nguyen to <="+n);
        int [] primaryArray = integer.primeValue(n);
        for(int item:primaryArray){
            if(item>0){
                System.out.println(item);
            }
        }
        System.out.println(n+" so Fibonacci gom:");
        int [] fibonacciArray = integer.fibonacciArray(n);
        int sum = 0;
        for(int item:fibonacciArray){
            if(item>0){
                System.out.println(item);
                sum+=item;
            }
        }
        System.out.println("Tong " +n+ " so Fibonacci:"+sum);

    }
}
