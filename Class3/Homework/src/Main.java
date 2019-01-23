import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap can nang cua cho:");
        int weightDog = scanner.nextInt();
        System.out.println("Nhap can nang cua meo:");
        int weightCat = scanner.nextInt();

        Cat objCat = new Cat(1,"Japan","Blue",weightCat,20);
        Dog objDog = new Dog(1,"Spain","Orange",weightDog,20);

        if(objCat.Weight>objDog.Weight){
            System.out.print("Cat ");
            objCat.Scratch();
            System.out.print("Dog ");
        }else {
            System.out.print("Dog ");
            objDog.Bark();
            System.out.print("Cat ");
        }
    }
}
