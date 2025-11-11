
// 20. Multiple inheritance using interfaces
interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

class Combined implements Interface1, Interface2 {
    public void method1() { System.out.println("Method1 from Interface1"); }
    public void method2() { System.out.println("Method2 from Interface2"); }

    public static void main(String[] args) {
        Combined obj = new Combined();
        obj.method1();
        obj.method2();
    }
}
