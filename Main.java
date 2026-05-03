import zoo.base.Animal;
import zoo.helpers.VetReport;
import zoo.pets.Cat;
import zoo.pets.Dog;
import zoo.pets.GuardDog;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Rokcy", 4, "German Shepherd");
        GuardDog gd = new GuardDog("Mx", 6, "Belgian Malinois", "Front Gate");
        Cat c1 = new Cat("Millo", 2);

        System.out.println("Base and child class");
        d1.showParentMethod();
        d1.showDogInfo();

        System.out.println();
        System.out.println("Single inheritance demo");
        d1.makeSound();

        System.out.println();
        System.out.println("Multilevel inheritance demo");
        gd.makeSound();
        gd.guardArea();

        System.out.println();
        System.out.println("Hierarchical inheritance demo");
        c1.introduce();
        c1.makeSound();

        System.out.println();
        System.out.println("Protected and visibility");
        System.out.println("Main can use public methods here.");
        System.out.println("Dog age from getter is: " + d1.getAge());

        System.out.println();
        System.out.println("Overriding and runtime polymorphism");
        Animal[] arr = {d1, gd, c1};
        for (Animal a : arr) {
            a.introduce();
            a.makeSound();
            a.move();
            a.showBaseRule();
            System.out.println();
        }

        System.out.println("super and constructor demo");
        Dog d2 = new Dog("Budy", 3, "Labrador");
        d2.showDogInfo();
        Cat c2 = new Cat("Lunna", 1);
        c2.introduce();

        System.out.println();
        System.out.println("Static method hiding demo");
        Animal.classType();
        Dog.classType();

        System.out.println();
        System.out.println("Multiple inheritance rule");
        System.out.println("Java does not let one class extend two classes.");
        System.out.println("So Dog extends Animal only and uses interface too.");

        System.out.println();
        System.out.println("Final class and overloading");
        VetReport rpt = new VetReport();
        rpt.printAnimal(d1);
        rpt.printAnimal(gd, "Security Dog");
    }
}
