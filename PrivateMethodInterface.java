
// 18. Private methods inside interface (Java 9+)
interface PrivateDemo {
    private void helper() {
        System.out.println("Private helper method");
    }

    default void display() {
        helper(); // Accessible within default method
        System.out.println("Default method using private helper");
    }
}

class TestPrivate implements PrivateDemo {
    public static void main(String[] args) {
        new TestPrivate().display();
    }
}
