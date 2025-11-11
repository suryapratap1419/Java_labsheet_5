
// 2. Using super() in constructors
class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called");
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
        System.out.println("Student constructor called");
    }

    public static void main(String[] args) {
        Student s = new Student("Priyanshu", 101);
    }
}
