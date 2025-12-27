

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.printInfo();       //DOT notation

        Animal a2 = new Animal("Shadya");
        a2.printInfo();

        Animal a3 = new Animal(4);
        a3.printInfo();

        Animal a4 = new Animal("Faryd", 5);
        a4.printInfo();

        a1.makeSound();     // invoking a method against the object a1
        a2.makeSound();
        a3.makeSound();
        a4.makeSound();

        System.out.println("----------------------------------");


        Cat c2 = new Cat("Shoky", 6);
    }
}

