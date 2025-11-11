
// 14. Interface with static and default methods
interface MyInterface {
    static void staticMethod() {
        System.out.println("Static method in interface");
    }

    default void defaultMethod() {
        System.out.println("Default method in interface");
    }
}

class MyClass implements MyInterface {
    public static void main(String[] args) {
        MyInterface.staticMethod();
        new MyClass().defaultMethod();
    }
}
