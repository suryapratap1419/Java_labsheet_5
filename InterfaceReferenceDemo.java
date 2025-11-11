
// 13. Interface reference
interface Driveable {
    void drive();
}

class Car implements Driveable {
    public void drive() { System.out.println("Car is driving"); }

    public static void main(String[] args) {
        Driveable d = new Car();
        d.drive();
    }
}
