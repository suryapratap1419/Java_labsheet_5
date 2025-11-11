
// 3. Demonstrating private, protected, and public access
package accessdemo;

class Parent {
    private int privateVar = 10;
    protected int protectedVar = 20;
    public int publicVar = 30;

    void showVars() {
        System.out.println("Private: " + privateVar + ", Protected: " + protectedVar + ", Public: " + publicVar);
    }
}

public class AccessModifiersDemo extends Parent {
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();
        // System.out.println(obj.privateVar); // Not accessible
        System.out.println("Protected Var: " + obj.protectedVar);
        System.out.println("Public Var: " + obj.publicVar);
    }
}
