# oop mini project 2

this code is about a small animal system. "Animal" is the main base class. it stores the name, category, and age of the animal and has the basic methods that print the animal info, sound, and movement. it also has a final method and a static method.

"Dog" extends "Animal" and adds the breed plus its own sound and move methods. it also uses "this" and "super" to show the child class fields and the parent class field. "GuardDog" extends "Dog" so it shows multilevel inheritance. "Cat" also extends "Animal" so it shows hierarchical inheritance. the classes are in different packages to show visibility and package use, and the base class has "protected" members that the child classes can use.

"Main" makes objects from the classes and runs them to show the oop topics in the output. it shows base and child class relation, single inheritance, multilevel inheritance, hierarchical inheritance, overriding, runtime polymorphism, static method hiding, and the multiple inheritance restriction in java. it also creates an array of type "Animal" with different object types inside it to show polymorphism.

"VetReport" is a final class and it has overloaded methods to print animal details in two ways, so it shows compile time polymorphism too. "Trainable" is used as an interface because java does not allow one class to extend two classes.

to run the code i used "javac Main.java zoo\base\Animal.java zoo\pets\Dog.java zoo\pets\GuardDog.java zoo\pets\Cat.java zoo\helpers\VetReport.java zoo\skills\Trainable.java" and after that i used "java Main".
