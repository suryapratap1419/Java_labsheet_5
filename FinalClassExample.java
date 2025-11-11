
// 7. Final class cannot be inherited
final class FinalClass {
    void display() { System.out.println("Final class"); }
}

// class SubClass extends FinalClass { } // Error: cannot inherit from final class

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}
