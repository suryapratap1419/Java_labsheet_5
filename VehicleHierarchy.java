
// 4. Multilevel inheritance
class Vehicle {
    void start() { System.out.println("Vehicle started"); }
}

class Car extends Vehicle {
    void honk() { System.out.println("Car honks"); }
}

class ElectricCar extends Car {
    void charge() { System.out.println("Electric car charging"); }

    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.start();
        e.honk();
        e.charge();
    }
}
