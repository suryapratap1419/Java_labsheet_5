
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bow Bow");
    }
}

public class TestPoly {
    public static void main(String[] args) {
        Animal a1 = new Animal();   
        Animal a2 = new Dog();

        a1.makeSound();
          
        a2.makeSound();  
    }
}
