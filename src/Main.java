import dog.Dog;

public class Main {
    public static void main(String[] args) {

       Dog myDog = new Dog("Bobby",3,"Male","Bull Dog");
       myDog.displayInfo();
       myDog.sound();
       myDog.food();
       myDog.movement();
    }
}