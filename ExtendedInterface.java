
// 16. Interface inheritance
interface ParentInterface {
    void display();
}

interface ChildInterface extends ParentInterface {
    void message();
}

class Implementation implements ChildInterface {
    public void display() { System.out.println("Display from parent interface"); }
    public void message() { System.out.println("Message from child interface"); }

    public static void main(String[] args) {
        Implementation obj = new Implementation();
        obj.display();
        obj.message();
    }
}
