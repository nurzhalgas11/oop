public class task3 {
    public static void main(String[] args) {
        Engine eng1 = new Engine("Eng1",2,6,12);
        Engine eng2 = new Engine("Eng2",4,7,11);
        Engine eng3 = new Engine("Eng3",6,8,10);

        Car car1 = new Car("Maybach","GLC",280,562,eng1);
        Car car2 = new Car("Rolls ","phantom",250,25622,eng2);
        Car car3 = new Car("Reus","Marco",210,525,eng2);
        Car car4 = new Car("Ozil","Mesut",300,515,eng3);
        Car car5 = new Car("Podolski","Lucas",615,591,eng3);
        Car car6 = new Car("Gerd","Muller",511,258,eng1);

        Car[] carlar = {car1,car2,car3,car4,car5,car6};
        int totalWeight = 0;
        for (int j=0;j<carlar.length;j++) {

            totalWeight += carlar[j].TotalWeight();
        }
        System.out.println(totalWeight);
    }
}
class Engine{
    String name;
 int cylinderAmount;
 double cylinderVolume;
  int weight;

    public int getWeight() {
        return weight;
    }

    public Engine() {
    }

    public Engine(String name, int cylinderAmount, double cylinderVolume, int weight) {
        this.name = name;
        this.cylinderAmount = cylinderAmount;
        this.cylinderVolume = cylinderVolume;
        this.weight = weight;
    }
}

class Car{
    String name;
    String model;
    int speed;
 int weight;

 Engine engine;

    public Car() {

    }

    public Car(String name, String model, int speed, int weight, Engine engine) {
        this.name = name;
        this.model = model;
        this.speed = speed;
        this.weight = weight;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                ", engine=" + engine +
                '}';
    }
    void ride(){
        System.out.println("The car is going");
    }
    int TotalWeight(){
        return weight+ engine.getWeight();
    }


}