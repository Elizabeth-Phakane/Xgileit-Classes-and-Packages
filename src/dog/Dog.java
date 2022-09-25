package dog;

import animal.Animal;

public class Dog extends Animal {

   public Dog(String name, int age, String gender, String breed) {
        super(name, age, gender, breed);
    }


//Method implementations
    @Override
    public void sound() {
        System.out.println("The Dog Barks!");
    }

    @Override
    public void food() {
        System.out.println("The Dog eats bones");

    }

    @Override
    public void movement() {
        System.out.println("The Dog runs");
    }

    @Override
    public void displayInfo() {
        System.out.println("Information about the Dog: ");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(breed);

    }
}
