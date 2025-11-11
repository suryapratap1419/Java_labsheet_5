
// 8. Method overriding example
class Parent {
    void display() {
        System.out.println("Display from Parent");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Display from Child");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.display(); // Calls overridden method
    }
}
