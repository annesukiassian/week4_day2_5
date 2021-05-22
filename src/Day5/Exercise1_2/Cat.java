package Day5.Exercise1;

public class Cat extends Animal {
    public Cat() {
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    public void sound(Cat c) {
        System.out.println("Overloaded Meow");
    }
}
