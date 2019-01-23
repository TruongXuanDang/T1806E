import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Car objCar1 = new Car();
        objCar1.Id = 1;
        objCar1.Color="Red";
        objCar1.Kilometer=200;
        objCar1.Brand="Ford";

        Car objCar2 = new Car();
        objCar2.Id = 2;
        objCar2.Color="Blue";
        objCar2.Kilometer=250;
        objCar2.Brand="Kia";

        if(objCar1.Kilometer>objCar2.Kilometer){
            System.out.println(objCar1.Brand+ " di nhieu hon "+objCar2.Brand+", so banh: "+ Car.so_banh);
        }else {
            System.out.println(objCar2.Brand+ " di nhieu hon "+objCar1.Brand +", so banh: "+ Car.so_banh);
        }

        objCar1.running();
        objCar1.reMake();
        System.out.println("Mau son xe 1: "+objCar1.Color);
        objCar1.reMakeAgain(objCar1,"BLue");
        System.out.println("Mau son xe 1: "+objCar1.Color);

        Car objCar3 = new Car();
        Car objCar5 = new Car(5,5000,"Honda","Yealow");
        System.out.println("O to 5 la xe "+objCar5.Brand);
        Scanner scanner = new Scanner(System.in);
        Car[] carArr = new Car[5];
        for(int i=0;i<5;i++){

            System.out.println("Nhap gia tri xe: "+i);
            int n = scanner.nextInt();
            carArr [i] = new Car(n);
        }
//        carArr [0]=new Car(5000,"Honda");
//        carArr [1]=new Car(6000,"Toyota");
//        carArr [2]=new Car(7000,"Kia");
//        carArr [3]=new Car(8000,"Ford");
//        carArr [4]=new Car(9000,"Lambo");

        System.out.println("Nhap so tien ong A: ");
        int a = scanner.nextInt();
        Person objPerson1 = new Person(a);

//        Person objPerson1 = new Person(7500);
        System.out.println("Ong A du tien mua xe:");
        Car carCanBuy = new Car(0);
        for(int i =0;i<5;i++){
            if(objPerson1.Amount>carArr[i].Price){
                System.out.println("Xe "+i);
                if(carArr[i].Price >carCanBuy.Price){
                    carCanBuy = new Car(carArr[i].Price);
                }
            }
        }
        System.out.println("Xe xin nhat co the mua co gia:"+carCanBuy.Price);
    }
}
