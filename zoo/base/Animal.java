package zoo.base;

public class Animal {
    protected String name;
    protected String category;
    private int age;

    public Animal() {
        this("Unknown", 0, "Animal");
        System.out.println("Animal default constructor started.");
    }

    public Animal(String name, int age, String category) {
        this.name = name;
        this.age = age;
        this.category = category;
    }

    public void introduce() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Category: " + this.category);
    }

    public void makeSound() {
        System.out.println(this.name + " makes some animal sound.");
    }

    public void move() {
        System.out.println(this.name + " moves around.");
    }

    public final void showBaseRule() {
        System.out.println("This final method is from Animal.");
    }

    protected void showProtectedName() {
        System.out.println("Protected name is: " + this.name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public static void classType() {
        System.out.println("Animal static method");
    }
}
