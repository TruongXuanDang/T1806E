public class Dog {
    int Id;
    String Kind;
    String Color;
    int Weight;
    int Age;

    public void Bark(){
        System.out.println("Bark");
    }

    public void Eat(){
        System.out.println("Eat");
    }
    public void Run(){
        System.out.println("Run");
    }

    public Dog(int id, String kind, String color, int weight, int age){
        this.Id = id;
        this.Kind = kind;
        this.Color = color;
        this.Weight = weight;
        this.Age = age;
    }
}
