package zoo.pets;

import zoo.base.Animal;
import zoo.skills.Trainable;

public class Dog extends Animal implements Trainable {
    protected String breed;
    protected String category = "Dog";

    public Dog(String name, int age, String breed) {
        super(name, age, "Animal");
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " barks loud.");
    }

    @Override
    public void move() {
        System.out.println(this.name + " runs fast");
    }

    @Override
    public void introduce() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.getAge());
        System.out.println("Category: " + this.category);
        System.out.println("Breed: " + this.breed);
    }

    @Override
    public void train() {
        System.out.println(this.name + " follows the train command.");
    }

    @Override
    public String getCategory() {
        return this.category;
    }

    public void showDogInfo() {
        System.out.println("Dog name with this is: " + this.name);
        System.out.println("Dog field is: " + this.category);
        System.out.println("Parent field is: " + super.category);
        System.out.println("Breed is: " + this.breed);
        super.showProtectedName();
    }

    public void showParentMethod() {
        super.introduce();
    }

    public static void classType() {
        System.out.println("Dog static method");
    }
}
