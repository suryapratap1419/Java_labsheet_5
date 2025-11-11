
// 9. Superclass reference pointing to subclass object
class Superclass {
    void greet() { System.out.println("Hello from Superclass"); }
}

class Subclass extends Superclass {
    @Override
    void greet() { System.out.println("Hello from Subclass"); }

    public static void main(String[] args) {
        Superclass obj = new Subclass();
        obj.greet(); // Polymorphic call
    }
}
