public class Car {
    int Id;
    String Color;
    int Kilometer;
    String Brand;
    int Price;

    public  static int so_banh =4;

//    Constructor
    public Car(){
        System.out.println("Vua tao ra 1 o to");
    }

    public Car(int x,String Brand){
        this.Price = x;
        this.Brand=Brand;
        System.out.println(Brand+" Gia tien o to: "+x);
    }

    public Car(int x){
        this.Price =x;

    }

    public Car(int x, int y,String z, String k){
        this.Id=x;
        this.Kilometer=y;
        this.Brand=z;
        this.Color=k;
    }

    void running (){
        System.out.println("Xe dang chay");
    }

    public  void reMake(){
        this.Color ="Pink";
    }
    public void reMakeAgain(Car x, String newColor){
        x.Color=newColor;
    }
}
