package name.java_lab5;

class SuperClass {
    private int privateVar = 1;
    protected int protectedVar = 2;
    public int publicVar = 3;

    public SuperClass() {
        System.out.println("SuperClass constructor");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    public void publicMethod() {
        System.out.println("Public method");
    }

    public void accessPrivateMethod() {
        privateMethod();
    }
}

class SubClass extends SuperClass {
    public void display() {
        // System.out.println("Private Var: " + privateVar); // Not accessible
        System.out.println("Protected Var: " + protectedVar); // Accessible
        System.out.println("Public Var: " + publicVar); // Accessible

        // privateMethod(); // Not accessible
        protectedMethod(); // Accessible
        publicMethod(); // Accessible

        // Access private method via public method
        accessPrivateMethod();
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}
