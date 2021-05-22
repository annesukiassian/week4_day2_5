package Day5.Exercise1;

public class Main {
    public static void main(String[] args) {
        // runtime polymorphism
        Animal horse1 = new Horse();
        horse1.sound();
        Cat cat1 = new Cat();
        cat1.sound();
        // compile-time polymorphism
        cat1.sound(cat1);
    }

}
