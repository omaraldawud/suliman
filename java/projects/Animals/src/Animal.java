// Super Class - Parent Class - Generalization
class Animal {
    private String name;
    private int age;

    // Default constructor
    public Animal() {
        this.name = "unknown";
        this.age = 0;
    }

    // Overloaded Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // another OLC
    public Animal(String name) {
        this.name = name;
        this.age = 0;
    }

    // yet another OLC
    public Animal(int age) {
        this.name = "";
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    public void printInfo() {
        System.out.println("Animal: " + this.name + ", Age: " + this.age);
    }

    public String getName() { return this.name; } 	// getter
    public void setName(String name) { this.name = name; }  // setter
    public void setAge(int age) {
        this.age = age;
    }


}

