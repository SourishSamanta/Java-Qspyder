public class CarBlueprint{
    public static void main(String[] args) {
        CarBlueprint myCar = new CarBlueprint();
    }
}

class Engine{
    int hp;
    int torque;

    Engine(int hp, int torque) {
        this.hp = hp;
        this.torque = torque;
    }

    
}

class Car{
    String brand;
    double price;
    Engine e;

    Car(String brand, double price, int hp, int torque) {
        this.brand = brand;
        this.price = price;
        this.e = new Engine(hp, torque);
    }

    
}