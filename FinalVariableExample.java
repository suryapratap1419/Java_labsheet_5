
// 6. Final variable demonstration
class FinalVariableExample {
    final int MAX_VALUE = 100;

    void changeValue() {
        // MAX_VALUE = 200; // Error: cannot assign a value to final variable
    }

    public static void main(String[] args) {
        FinalVariableExample obj = new FinalVariableExample();
        System.out.println("Final variable: " + obj.MAX_VALUE);
    }
}
