
// 15. Default method conflict resolution
interface A {
    default void show() { System.out.println("From A"); }
}

interface B {
    default void show() { System.out.println("From B"); }
}

class C implements A, B {
    public void show() {
        A.super.show(); // Resolving conflict
    }

    public static void main(String[] args) {
        new C().show();
    }
}
