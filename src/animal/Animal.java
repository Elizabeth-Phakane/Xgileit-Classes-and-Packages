package animal;

public abstract class Animal {
    public String name;
    public  int age;
    public  String gender;
    public  String breed;

//Constructor to assign values to the attributes
   public Animal (String name , int age, String gender, String breed){
        this.name = name ;
        this.age = age ;
        this.gender = gender ;
        this.breed = breed ;
    }


   
//method declarations  for the animal class

     public abstract void sound();
     public abstract void food();
     public abstract void movement();
     public abstract void displayInfo();



}
