
// 10. Using super to access hidden superclass method
class A {
    void show() {
        System.out.println("Show from class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Show from class B");
        super.show(); // Access superclass method
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
