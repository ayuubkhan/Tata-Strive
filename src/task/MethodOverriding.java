package task;

class Animal {
void sound() {
    System.out.println("Animal makes a sound");
}
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Rabbit extends Animal {
    @Override
    void sound() {
        System.out.println("Rabbit Hmmmmm");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting
        animal.sound();

        Animal animal1 = new Rabbit();
        animal1.sound();
    }
}
