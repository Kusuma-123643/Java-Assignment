abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks.");
    }

    public static void main(String[] args) {
        Animal a = new Dog(); // 2. Create an object in the child class for the abstract class and access the non-abstract methods
        a.sleep();

        Dog d = new Dog(); 
        d.makeSound();       // 3. Create an instance for the child class in child class and call abstract methods
        d.sleep();           // 4. Create an instance for the child class in child class and call non-abstract methods
    }
}
