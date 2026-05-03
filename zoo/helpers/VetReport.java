package zoo.helpers;

import zoo.base.Animal;

public final class VetReport {
    public void printAnimal(Animal animal) {
        System.out.println("Vet report for " + animal.getName() + " in category " + animal.getCategory());
    }

    public void printAnimal(Animal animal, String label) {
        System.out.println(label + ": " + animal.getName() + " is " + animal.getAge() + " years old");
    }
}
