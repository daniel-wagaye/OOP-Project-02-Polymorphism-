package zoo.pets;

import zoo.base.Animal;

public class Cat extends Animal {
    public Cat(String name, int age) {
        this.name = name;
        this.category = "Cat";
        this.setAge(age);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " meows");
    }

    @Override
    public void move() {
        System.out.println(this.name + " walks quietly");
    }
}
