
// 5. Final method demonstration
class Base {
    final void show() {
        System.out.println("Final method in Base");
    }
}

class Derived extends Base {
    // void show() { System.out.println("Cannot override final method"); } // Compiler error
    public static void main(String[] args) {
        Derived d = new Derived();
        d.show();
    }
}
