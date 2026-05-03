package zoo.pets;

public class GuardDog extends Dog {
    private String area;

    public GuardDog(String name, int age, String breed, String area) {
        super(name, age, breed);
        this.area = area;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " gives a warning bark.");
    }

    public void guardArea() {
        super.train();
        System.out.println(this.name + " guards the " + this.area);
    }
}
