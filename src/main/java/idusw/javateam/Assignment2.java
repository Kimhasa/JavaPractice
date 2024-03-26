package idusw.javateam;

public class Assignment2 {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        animal1.sound();

        Dog dog = (Dog) animal1;
        dog.sound();
    }
}

class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark!");
    }
}