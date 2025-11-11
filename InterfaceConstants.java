
// 17. Interface with constants
interface Constants {
    int MAX = 100;
}

class ConstantsDemo implements Constants {
    public static void main(String[] args) {
        System.out.println("Constant value: " + MAX);
    }
}
