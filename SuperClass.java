
class Person{
    String name;
    public Person(String name){
        this.name=name;
        System.out.println("Hi This is a Person." + name);
    }
}
class Student extends Person {
    int age;
    public Student(String name, int age){
        super(name);
        this.age=age;
        System.out.println("The student's age is : " + age);
    }
}

public class SuperClass {
    public static void main(String[] args) {
        Student s= new Student("Priyanshu",22);
    }
}
